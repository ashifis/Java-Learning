package com.Rest.Advance;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;


@Provider
public class MyDateParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(final Class<T> rawType, Type genericType, Annotation[] annotations) {
		// TODO Auto-generated method stub
		if(rawType.getName().equalsIgnoreCase(MyDate.class.getName())) {
			 return new ParamConverter<T>() {

				@Override
				public T fromString(String value) {
					// TODO Auto-generated method stub
					
					Calendar calendar = Calendar.getInstance();
					
					MyDate myDate = new MyDate();
					
					if("tomorrow".equalsIgnoreCase(value)) {
						calendar.add(Calendar.DATE, 1);
						myDate.setNote("Tomorrow will be ");
						
					}else if("yesterday".equalsIgnoreCase(value)) {
						calendar.add(Calendar.DATE, -1);
						myDate.setNote("Yesterday was ");
					}
					else if("today".equalsIgnoreCase(value)) {
						myDate.setNote("Today is ");
					}else {
						myDate.setNote("Oops... ");
						return rawType.cast(myDate);
					}
					
					
					
					myDate.setDate(calendar.get(Calendar.DATE));
					myDate.setMonth(calendar.get(Calendar.MONTH));
					myDate.setYear(calendar.get(Calendar.YEAR));
					
					return rawType.cast(myDate);
				}

				@Override
				public String toString(T myBean) {
					// TODO Auto-generated method stub
					if(myBean == null) {
						return null;
					}
					return myBean.toString();
				}
				 
			 };
		}
		
		
		return null;
	}

}
