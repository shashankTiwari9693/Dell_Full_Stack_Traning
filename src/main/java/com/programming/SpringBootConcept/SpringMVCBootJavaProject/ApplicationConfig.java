package com.programming.SpringBootConcept.SpringMVCBootJavaProject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages ="com.programming.SpringBootConcept.SpringMVCBootJavaProject" )
public class ApplicationConfig extends WebMvcConfigurationSupport {
@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry){
    registry.addResourceHandler("css/**","images/**")
            .addResourceLocations("classpath:/static/css/").
            addResourceLocations("classpath:/static/images/");
}

@Bean
    public InternalResourceViewResolver jsViewResolver(){
    InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/jsp/");
    viewResolver.setSuffix(".jsp");
    viewResolver.setViewClass(JstlView.class);
    return viewResolver;
}
}
