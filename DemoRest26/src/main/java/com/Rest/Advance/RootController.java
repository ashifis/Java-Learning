package com.Rest.Advance;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("webapi")
public class RootController extends Application{
	
	
}
/*
     <servlet>
        <servlet-name>Jersey Web Application</servlet-name>
        <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
        <init-param>
            <param-name>jersey.config.server.provider.packages</param-name>
            <!--  param-value>com.RestFul26.DemoRest26,com.RestHB.demo</param-value-->
             <param-value>com.RestHB.demo,com.RestFul26.DemoRest26,com.REST.advanced</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>Jersey Web Application</servlet-name>
        <url-pattern>/webapi/*</url-pattern>
        <!-- It will accept those requests which are coming with /webapi/* urls -->
    </servlet-mapping>

*/