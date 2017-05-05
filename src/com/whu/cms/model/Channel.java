package com.whu.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 
 * 写栏目的
 * */
@Entity
@Table(name="t_channel")
public class Channel {
	
	public static final String ROOT_NAME="HighCharts图表展示";
	public static final int ROOT_ID=0;
	
     //父级权限code，已经是根节点则为0
	private Integer pid;
	//权限code，主见id
	private Integer id;
	//权限在系统中访问的url
	private String url;
	//权限的名称
	private String name;
	//如果是菜单怎显示菜单
	private String icon;
	//如果是菜单，则连接执行frame区域
	private String target;
	//是否是父节点
	private boolean isParent;
	//是否是系统菜单的结构
	private boolean isMenu;
	
	private boolean isFlag;

	
	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}
	/**
	 * @param target the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	/**
	 * @return the isParent
	 */
	@Column(name="is_parent")
	public boolean isParent() {
		return isParent;
	}
	/**
	 * @param isParent the isParent to set
	 */
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	/**
	 * @return the isMenu
	 */
	@Column(name="is_menu")
	public boolean isMenu() {
		return isMenu;
	}
	/**
	 * @param isMenu the isMenu to set
	 */
	public void setMenu(boolean isMenu) {
		this.isMenu = isMenu;
	}
	/**
	 * @return the flag
	 */

	
	public Channel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the isFlag
	 */
	@Column(name="is_flag")
	public boolean isFlag() {
		return isFlag;
	}
	/**
	 * @param isFlag the isFlag to set
	 */
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	public Channel(Integer pid, Integer id, String url, String name, String icon, String target, boolean isParent,
			boolean isMenu) {
		super();
		this.pid = pid;
		this.id = id;
		this.url = url;
		this.name = name;
		this.icon = icon;
		this.target = target;
		this.isParent = isParent;
		this.isMenu = isMenu;
	}
	
	
	
	public Channel(Integer pid, Integer id, String url, String name, String icon, String target, boolean isParent,
			boolean isMenu, boolean isFlag) {
		super();
		this.pid = pid;
		this.id = id;
		this.url = url;
		this.name = name;
		this.icon = icon;
		this.target = target;
		this.isParent = isParent;
		this.isMenu = isMenu;
		this.isFlag = isFlag;
	}
	@Override
	public String toString() {
		return "Channel [pid=" + pid + ", id=" + id + ", url=" + url + ", name=" + name + ", icon=" + icon
				+ ", target=" + target + ", isParent=" + isParent + ", isMenu=" + isMenu + "]";
	}
	
	
	
}
