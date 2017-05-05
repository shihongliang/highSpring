package com.whu.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 
 * д��Ŀ��
 * */
@Entity
@Table(name="t_channel")
public class Channel {
	
	public static final String ROOT_NAME="HighChartsͼ��չʾ";
	public static final int ROOT_ID=0;
	
     //����Ȩ��code���Ѿ��Ǹ��ڵ���Ϊ0
	private Integer pid;
	//Ȩ��code������id
	private Integer id;
	//Ȩ����ϵͳ�з��ʵ�url
	private String url;
	//Ȩ�޵�����
	private String name;
	//����ǲ˵�����ʾ�˵�
	private String icon;
	//����ǲ˵���������ִ��frame����
	private String target;
	//�Ƿ��Ǹ��ڵ�
	private boolean isParent;
	//�Ƿ���ϵͳ�˵��Ľṹ
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
