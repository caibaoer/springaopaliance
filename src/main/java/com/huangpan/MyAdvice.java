package com.huangpan;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor  {
	
		@Override
		public Object invoke(MethodInvocation invocation) throws Throwable {
			String methodName=invocation.getMethod().getName();
			System.out.println("执行"+methodName+"方法前");
			Object ob= invocation.proceed();
			System.out.println("执行"+methodName+"方法后");
			return ob;
		}
	
}
