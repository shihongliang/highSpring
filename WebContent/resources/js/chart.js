/**
 * 
 */
function getOptions(obj) {
	return {
		chart : {
			renderTo : 'container',
			type : obj.chartType
		},

		title : {
			text : obj.chartTitle
		},

		tooltip : {
			shared : true,
			crosshairs : true,
			valueSuffix : obj.valueSuffix

		},
		xAxis : {
			type : 'string',
			tickWidth : 0,
			gridLineWidth : 1,

			categories : []
		},
		yAxis : {
			title : {
				text : obj.yAxisTitle
			},
			labels: {
                align: 'left',
                x: 3,
                y: 16,
                format: '{value:.,0f}'
            },
            showFirstLabel: false
		},
		plotOptions : {
			line : {
				dataLabels : {
					enabled : true
				},
				enableMouseTracking : false
			}
		},
		series : []
	}
}

function getSeriesByData(seriesDatas) {
	var series = new Array();
	var categories = "";
	$.each(seriesDatas, function(i) {

		var seriesName = seriesDatas[i].name;
		var seriesData = [];
		var datas = seriesDatas[i].data;
		$.each(datas, function(j) {
			if (categories.indexOf(datas[j].category) < 0) {
				categories += "," + datas[j].category
			}
			if (datas[j].value)
				seriesData.push(datas[j].value);
			else
				seriesData.push(null);
		});

		var o = new Object();
		if (i == 0) {
			o.type = "spline";
		}
		o.name = seriesName;
		o.data = seriesData;
		o.dataLabels = {
			enabled : false
		}
		if (seriesDatas[i].type)
			o.type = seriesDatas[i].type;
		series[i] = o;
	});
	categories = categories.substr(1);
	
	return {
		"categories" : categories.split(","),
		"series" : series
	};
}