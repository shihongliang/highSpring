package com.whu.cms.model;

public class SeriesData {
	private String category;
	private Double value;

	public SeriesData(String category, Double value) {
		this.category = category;
		this.value = value;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
