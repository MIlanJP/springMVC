package com.restexamples.config;

import com.restexamples.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    Skipping this methods
    protected Class<?>[] getRootConfigClasses() {
       ;return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {AppConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
