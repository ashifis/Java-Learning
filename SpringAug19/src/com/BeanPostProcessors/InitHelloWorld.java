package com.BeanPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld  implements BeanPostProcessor{

	public InitHelloWorld() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("After Initialization :" + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before Initialization :" + arg1);
		return arg0;
	}

}
