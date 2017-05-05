/**
 * 
 */
package com.whu.cms.model;

/**
 * @author hongliang
 *
 */
public class ChannelTree {
	
	private Integer id;
	private String name;
	private Integer pid;
	private String icon;
	private String url;
	private String target;

	
	
	
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
	 * @return the id
	 */
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
	 * 
	 */
	public ChannelTree() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param rootName
	 * @param name
	 */
	public ChannelTree(Integer id, String name, Integer pid) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
	}
	

	/**
	 * @param id
	 * @param name
	 * @param pid
	 * @param icon
	 */
	public ChannelTree(Integer id, String name, Integer pid, String icon) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.icon = icon;
	}
	/**
	 * @param id
	 * @param name
	 * @param pid
	 * @param icon
	 * @param url
	 */
	public ChannelTree(Integer id, String name, Integer pid, String icon, String url) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.icon = icon;
		this.url = url;
	}
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param pid
	 * @param icon
	 * @param url
	 * @param target
	 */
	public ChannelTree(Integer id, String name, Integer pid, String icon, String url, String target) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.icon = icon;
		this.url = url;
		this.target = target;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChannelTree [id=" + id + ", name=" + name + ", pid=" + pid + ", icon=" + icon + ", url=" + url
				+ ", target=" + target + "]";
	}
}
