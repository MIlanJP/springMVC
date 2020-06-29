package com.spingmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppConfigInitializer implements WebApplicationInitializer {

    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext configcontext=
                new AnnotationConfigWebApplicationContext();
        configcontext.register(AppContext.class);
        DispatcherServlet dispatcherServlet=new DispatcherServlet(configcontext);
        ServletRegistration.Dynamic myservletdispacter=
                servletContext.addServlet("mydispatcherServlet",dispatcherServlet);
//        Load on start up
        myservletdispacter.setLoadOnStartup(1);
//        url mapping
        myservletdispacter.addMapping("/user/");

    }
}
