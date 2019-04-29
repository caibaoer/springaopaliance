package com.huangpan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huangpan.service.UserService;



public class TestDemo {

	public static void main(String[] args) {
		
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userServiceImpl=(UserService)applicationContext.getBean("userServiceId");
		userServiceImpl.get();
		
		//这里是使用 <aop:pointcut expression="execution(* com.huangpan.serviceImlp.*.*(..))" id="pointC"/>时候测试,应该不行，因为包后面只有一点，指该包下面的所有类,不包含子包里面的
		/**
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userServiceImpl=(UserService)applicationContext.getBean("userServiceId2");
		userServiceImpl.get();
		**/
	}

}
