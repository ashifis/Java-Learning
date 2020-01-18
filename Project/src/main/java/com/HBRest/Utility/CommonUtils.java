package com.HBRest.Utility;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
	
	public void enter(String meth) {
    	
    	System.out.println("Inside " + meth);
    }
    public void exit(String meth) {
    	
    	System.out.println("Exit " + meth);
    }

}
