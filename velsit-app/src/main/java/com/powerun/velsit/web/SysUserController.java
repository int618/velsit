/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */

package com.powerun.velsit.web;


import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.powerun.util.IdentityUtil;
import com.powerun.velsit.domain.entity.SysUser;
import com.powerun.velsit.service.SysUserService;

/**
 * 系统用户控制类
 * @author jiangjq
 * @since 2016-04-27
 */
@Controller
public class SysUserController {
private final static Logger logger = LoggerFactory.getLogger(SysUserController.class);
	
	@Autowired
	private SysUserService sysUserService;
	
	@Value("${application.sitid}")
	private String sitid = "sitid is null";
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/find")
	public String find(Map<String, Object> model) {
		Iterable<SysUser> sysusers = sysUserService.findAll();
		model.put("sysusers", sysusers);
		return "sysuser";
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public String get(Map<String, Object> model) {
		return sysUserService.getSysUserByCode("my test");
	}
	
	@RequestMapping("/save")
	@ResponseBody
	@Transactional
	public String save() {
		
		//String id, String usergroupid, String code, String status, Date rcreatetime, Date rupdatetime, String rstatus
		Date now = new Date();
		SysUser sysUser = new SysUser(IdentityUtil.genGuid(), "Jerry.Jiang", "1", now, now, "1");
		logger.info("start save id =" + sysUser.getId());
		sysUser = this.sysUserService.save(sysUser);
		logger.info("Success saved id =" + sysUser.getId());
		return "Saved sysUser.code = " + sysUser.getCode();
	}

}
