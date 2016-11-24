package net.wumeijie.interceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = { "net.wumeijie.controller" })
public class TokenCheckConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 拦截API请求
		registry.addInterceptor(new TokenCheckInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}