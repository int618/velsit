/*
 * Copyright (c) 2016 JiangJQ, All rights reserved.
 */
package com.powerun.velsit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class VelsitApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(VelsitApplication.class, args);
	}

}
