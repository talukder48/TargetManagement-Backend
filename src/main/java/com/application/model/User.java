package com.application.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "erp_user")
public class User {
	@Id
	@Column(name = "USER_ID")
	private String UserId;
	@Column(name = "USER_NAME")
	private String UserName;
	@Column(name = "USER_PASSWORD")
	private String Password;
	@Column(name = "USER_BRANCH")
	private String UserBranch;
	@Column(name = "USER_ROLE")
	private String UserRole;
	@Column(name = "CHECK_ROLE")
	private String CheckRole;
	@Column(name = "AUTH_ROLE")
	private String AuthRole;
	@Column(name = "ENTD_BY")
	private String EntyBy;
	@Column(name = "ENTD_ON")
	private Date EntyOn;
	@Column(name = "MOD_BY")
	private String ModBy;
	@Column(name = "MOD_ON")
	private Date ModOn;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getUserBranch() {
		return UserBranch;
	}

	public void setUserBranch(String userBranch) {
		UserBranch = userBranch;
	}

	public String getUserRole() {
		return UserRole;
	}

	public void setUserRole(String userRole) {
		UserRole = userRole;
	}

	public String getCheckRole() {
		return CheckRole;
	}

	public void setCheckRole(String checkRole) {
		CheckRole = checkRole;
	}

	public String getAuthRole() {
		return AuthRole;
	}

	public void setAuthRole(String authRole) {
		AuthRole = authRole;
	}

	public String getEntyBy() {
		return EntyBy;
	}

	public void setEntyBy(String entyBy) {
		EntyBy = entyBy;
	}

	public Date getEntyOn() {
		return EntyOn;
	}

	public void setEntyOn(Date entyOn) {
		EntyOn = entyOn;
	}

	public String getModBy() {
		return ModBy;
	}

	public void setModBy(String modBy) {
		ModBy = modBy;
	}

	public Date getModOn() {
		return ModOn;
	}

	public void setModOn(Date modOn) {
		ModOn = modOn;
	}

	

}
