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
	//�û���¼����
	private String username;
	//�û���¼����
	private String password;
	//�û�����������
	private String nickname;
	//�û����ʼ�
	private String email;
	//�û�����ϵ�绰
	private String phone;
	//�û���ʾ��״̬
	private int status;
	//�û�������ʱ��
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
	@NotNull(message="�û�������Ϊ��")
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
	@NotNull(message="�û����벻��Ϊ��")
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
	@Email(message="�ʼ���ʽ����ȷ")
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
