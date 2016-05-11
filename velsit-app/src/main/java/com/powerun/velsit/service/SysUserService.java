/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.service;

import com.powerun.velsit.domain.entity.SysUser;
/**
 * 系统用户管理业务服务
 * @author jiangjq
 * @since 2016-04-27
 */
public interface SysUserService {
	/**
	 * 根据用户标识码获得用户
	 * @param code 用户标识码
	 * @return SysUser
	 */
	SysUser getByCode(String code);
	
	/**
	 * 保存单个系统用户对象 
	 * @param sysUser
	 * @return SysUser
	 */
	SysUser save(SysUser sysUser);

	/**
	 * 保存单个系统用户对象 
	 * @param pageable
	 * @return Page<SysUser>
	 */
	Iterable<SysUser> findAll();
	
	String getSysUserByCode(String pcode);
	
}

