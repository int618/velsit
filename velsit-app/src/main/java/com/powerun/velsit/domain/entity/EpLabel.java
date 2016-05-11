/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 * 环保标志存储过程，用于调用相应的环保标志生成方法。
 * 
 * @author Jerry.Jiang
 * @since 2016-04-25
 */
@Entity
@Table(name = "SYS_USER")
/*
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "getReturn", procedureName = "getSysUserByCode", parameters = {
		@StoredProcedureParameter(name = "prefix", mode = ParameterMode.IN, type = String.class),
		@StoredProcedureParameter(name = "pcode", mode = ParameterMode.OUT, type = String.class),})
})
*/
public class EpLabel implements Serializable {
	private static final long serialVersionUID = 1L;
	//唯一主键代码，32位UUID
	@Id
	private String id;
}
