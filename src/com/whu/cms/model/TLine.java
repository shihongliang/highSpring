/**
 * 
 */
package com.whu.cms.model;

import java.util.List;

/**
 * @author hongliang
 *形成两条线
 */
public class TLine {
	//曲线图的标题
	private String title;
	//y轴标题
	private String yAxisTitle ;
	//x轴标题
	private String xAxisTitle;
	//x轴数据显示
	private List<String> categories;
	//每根线的数据
	private List<NLine> series;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the yAxisTitle
	 */
	public String getyAxisTitle() {
		return yAxisTitle;
	}
	/**
	 * @param yAxisTitle the yAxisTitle to set
	 */
	public void setyAxisTitle(String yAxisTitle) {
		this.yAxisTitle = yAxisTitle;
	}
	/**
	 * @return the xAxisTitle
	 */
	public String getxAxisTitle() {
		return xAxisTitle;
	}
	/**
	 * @param xAxisTitle the xAxisTitle to set
	 */
	public void setxAxisTitle(String xAxisTitle) {
		this.xAxisTitle = xAxisTitle;
	}
	/**
	 * @return the categories
	 */
	public List<String> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	/**
	 * @return the series
	 */
	public List<NLine> getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(List<NLine> series) {
		this.series = series;
	}
	/**
	 * @param title
	 * @param yAxisTitle
	 * @param xAxisTitle
	 * @param categories
	 * @param series
	 */
	public TLine(String title, String yAxisTitle, String xAxisTitle, List<String> categories, List<NLine> series) {
		super();
		this.title = title;
		this.yAxisTitle = yAxisTitle;
		this.xAxisTitle = xAxisTitle;
		this.categories = categories;
		this.series = series;
	}
	
	/**
	 * 
	 */
	public TLine() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TLine [title=" + title + ", yAxisTitle=" + yAxisTitle + ", xAxisTitle=" + xAxisTitle + ", categories="
				+ categories + ", series=" + series + "]";
	}
	
	
	
	
}
