/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系统用户实体对象，用于保存用户最基本的信息、状态、事务的一致性。
 * 
 * @author Jerry.Jiang
 * @since 2016-04-25
 */
@Entity
@Table(name = "SYS_USER")
public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//唯一主键代码，32位UUID
	@Id
	private String id;
	//用户组ID，外键代码，32位UUID
	private String usergroupid;
	//类型，根据需要进行用户分类，然后派生出不同的用户表存储各类用户的详细扩展信息
	private String typecode;
	//标识码，登录使用的唯一识别码
	private String code;
	//密码，后台加密存储
	private String password;
	//真实姓名
	private String name;
	//昵称
	private String petname;
	//区划编码6位数字
	private String district;
	//手机号码
	private String mobileno;
	//邮件地址
	private String email;
	//用户状态
	private String status;
	//创建时间
	private Date rcreatetime;
	//更新时间
	private Date rupdatetime;
	//备注
	private String rmemo;
	//记录状态（0删除，1有效)
	private String rstatus;

	/** default constructor */
	protected SysUser() {
	}

	/** minimal constructor */
	public SysUser(String id,  String code, String status,
			Date rcreatetime, Date rupdatetime, String rstatus) {
		this.id = id;
		this.code = code;
		this.status = status;
		this.rcreatetime = rcreatetime;
		this.rupdatetime = rupdatetime;
		this.rstatus = rstatus;
	}

	/** full constructor */
	public SysUser(String id, String usergroupid, String typecode, String code,
			String password, String name, String petname,
			String district, String mobileno, String email, String status,
			Date rcreatetime, Date rupdatetime, String rmemo, String rstatus) {
		this.id = id;
		this.usergroupid = usergroupid;
		this.typecode = typecode;
		this.code = code;
		this.password = password;
		this.name = name;
		this.petname = petname;
		this.district = district;
		this.mobileno = mobileno;
		this.email = email;
		this.status = status;
		this.rcreatetime = rcreatetime;
		this.rupdatetime = rupdatetime;
		this.rmemo = rmemo;
		this.rstatus = rstatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsergroupid() {
		return usergroupid;
	}

	public void setUsergroupid(String usergroupid) {
		this.usergroupid = usergroupid;
	}

	public String getTypecode() {
		return typecode;
	}

	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRcreatetime() {
		return rcreatetime;
	}

	public void setRcreatetime(Date rcreatetime) {
		this.rcreatetime = rcreatetime;
	}

	public Date getRupdatetime() {
		return rupdatetime;
	}

	public void setRupdatetime(Date rupdatetime) {
		this.rupdatetime = rupdatetime;
	}

	public String getRmemo() {
		return rmemo;
	}

	public void setRmemo(String rmemo) {
		this.rmemo = rmemo;
	}

	public String getRstatus() {
		return rstatus;
	}

	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}
}
