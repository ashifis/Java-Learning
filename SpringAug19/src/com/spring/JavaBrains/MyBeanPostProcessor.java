package com.spring.JavaBrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor  implements BeanPostProcessor{

	public MyBeanPostProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Inside postProcessAfterInitialization :" +  beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization :" +  beanName);
		if(bean instanceof Point){
			System.out.println(bean.toString());	
		}
		return bean;
	}

}
