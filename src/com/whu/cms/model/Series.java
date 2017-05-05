package com.whu.cms.model;

import java.util.List;

public class Series {
	private String name;
	private List<SeriesData> data;
	private String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SeriesData> getData() {
		return data;
	}

	public void setData(List<SeriesData> data) {
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
