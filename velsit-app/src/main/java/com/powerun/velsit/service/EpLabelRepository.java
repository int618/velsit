/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.service;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.powerun.velsit.domain.entity.SysUser;

/**
 * Spring Data JPA持久层接口，继承Repository<域对象类， 域对象类主键>
 * 基本的EntityManager（即CRUD操作）都不需要写本接口的实现类，Spring Data JPA根据规范的方法名即可实现相应的业务逻辑
 * @author jiangjq
 * @since 2016-05-11
 */
public interface EpLabelRepository extends Repository<SysUser, String> {
	@Procedure(procedureName = "getSysUserByCode")
	public SysUser getSysUserByCode(@Param("pcode") String pcode);
}
