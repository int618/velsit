/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.util;

import java.util.UUID;

/**
 * 主键生成工具类
 * @author jiangjq
 * @since 2016-04-27
 */
public class IdentityUtil {
	public static String genGuid(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
