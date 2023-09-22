package com.ovenfo;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ohSolutions.ohRest.util.service.SpringInterceptor;
import ohSolutions.ohRest.util.service.SpringJpoParam;

@Configuration  
public class SpringConfig implements WebMvcConfigurer  {  

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SpringInterceptor(BusinessApplication.dsOauth2, BusinessApplication.propertiesFile)).addPathPatterns("/**");
    }
    
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpringJpoParam());
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
    
}