/**
 * 
 */
package com.whu.cms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * @author hongliang
 *
 */
@Entity
@Table(name="t_user")
public class User {
	
	private int id;
	//用户登录名称
	private String username;
	//用户登录密码
	private String password;
	//用户的中文名称
	private String nickname;
	//用户的邮件
	private String email;
	//用户的联系电话
	private String phone;
	//用户表示的状态
	private int status;
	//用户创建的时间
	private Date createDate;
	/**
	 * @return the id
	 */
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	@NotNull(message="用户名不能为空")
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	@NotNull(message="用户密码不能为空")
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the ninckname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param ninckname the ninckname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the email
	 */
	@Email(message="邮件格式不正确")
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the createDate
	 */
	@Column(name="create_date")
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param ninckname
	 * @param email
	 * @param phone
	 * @param status
	 */
	public User(int id, String username, String password, String nickname, String email, String phone, int status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}
	
	
	
	
}
