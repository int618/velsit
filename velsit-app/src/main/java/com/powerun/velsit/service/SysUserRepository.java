/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.service;

import org.springframework.data.repository.CrudRepository;

import com.powerun.velsit.domain.entity.SysUser;

/**
 * Spring Data JPA持久层接口，继承Repository<域对象类， 域对象类主键>
 * 基本的EntityManager（即CRUD操作）都不需要写本接口的实现类，Spring Data JPA根据规范的方法名即可实现相应的业务逻辑
 * @author jiangjq
 * @since 2016-04-26
 */
public interface SysUserRepository extends CrudRepository<SysUser, String> {

}
