package com.spring.JavaBrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyFactoryBeanPostProcessor implements BeanFactoryPostProcessor{

	public MyFactoryBeanPostProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		System.out.println("Inside postProcessBeanFactory");
		//System.out.println(beanFactory.toString());
		System.out.println(beanFactory.getBean("rectangle").toString());
	
		
	}

}
