/**
 * 
 */
package com.whu.cms.model;

import java.util.List;
import java.util.Map;

/**
 * @author hongliang
 *形成一条线的新数据
 */
public class NLine {
	//每根曲线的名字
	private String name;
	//曲线的颜色
	private String color;
	//数据
	private	List<? extends Object> device;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

	/**
	 * @return the device
	 */
	public List<? extends Object> getDevice() {
		return device;
	}
	/**
	 * @param device the device to set
	 */
	public void setDevice(List<? extends Object> device) {
		this.device = device;
	}
	
	
	
	
	/**
	 * @param name
	 * @param color
	 * @param device
	 */
	public NLine(String name, String color, List<? extends Object> device) {
		super();
		this.name = name;
		this.color = color;
		this.device = device;
	}
	/**
	 * 
	 */
	public NLine() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NLine [name=" + name + ", color=" + color + ", device=" + device + "]";
	}
	
	
	
	
	
}
