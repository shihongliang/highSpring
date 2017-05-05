package com.whu.cms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_deviceInfo")
public class DeviceInfo {
	
	private int id;
	//设备名称
	private String name;
	//状态
	private String status;
	//开始时间
	private String startdate;
	//结束时间
	private String enddate;
	//数据
	private float data;
	//电压a数据
	private float ua;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public float getData() {
		return data;
	}
	public void setData(float data) {
		this.data = data;
	}
	public DeviceInfo() {
		
	}
	
	
	
	/**
	 * @return the ua
	 */
	public float getUa() {
		return ua;
	}
	/**
	 * @param ua the ua to set
	 */
	public void setUa(float ua) {
		this.ua = ua;
	}
	public DeviceInfo(int id, String name, String status, String startdate, String enddate, float data) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.startdate = startdate;
		this.enddate = enddate;
		this.data = data;
	}
	/**
	 * @param id
	 * @param name
	 * @param status
	 * @param startdate
	 * @param enddate
	 * @param data
	 * @param ua
	 */
	public DeviceInfo(int id, String name, String status, String startdate, String enddate, float data, float ua) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.startdate = startdate;
		this.enddate = enddate;
		this.data = data;
		this.ua = ua;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DeviceInfo [id=" + id + ", name=" + name + ", status=" + status + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", data=" + data + ", ua=" + ua + "]";
	}
	
	
	

}
