/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.powerun.velsit.domain.entity.SysUser;

/**
 * 系统用户CRUD业务管理服务实现类
 * 使用相应的Repository，也就是DAO来完成相应的业务处理
 * @author jiangjq
 * @since 2016-04-27
 */
@Component("sysUserService")
@Transactional
public class SysUserServiceImpl implements SysUserService {
	private final SysUserRepository sysUserRepository;
	private final EpLabelRepository epLabelRepository;
	
	@Autowired
	public SysUserServiceImpl(SysUserRepository sysUserRepository, EpLabelRepository epLabelRepository) {
		this.sysUserRepository = sysUserRepository;
		this.epLabelRepository = epLabelRepository;
	}
	
	public SysUser getByCode(String code) {
		return null;
	}
	
	public SysUser save(SysUser sysUser) {
		return this.sysUserRepository.save(sysUser);
	}
	
	public Iterable<SysUser> findAll() {
		return this.sysUserRepository.findAll();
	}
	
	public String getSysUserByCode(String pcode) {
		String ret = "default ret";
		ret = epLabelRepository.getSysUserByCode(ret);
		return ret;
	}
}
