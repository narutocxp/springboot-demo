package com.rongji.springboot.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.rongji.springboot.demo.interceptor.RegisterInterceptor;
import com.rongji.springboot.demo.interceptor.LoginInterceptor;

@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/login/**");
		registry.addInterceptor(new RegisterInterceptor()).addPathPatterns("/register/**");
		super.addInterceptors(registry);
	}

}
