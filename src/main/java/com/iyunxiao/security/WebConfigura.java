package com.iyunxiao.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：qianpeng
 * @date ：Created in 2019-07-03 18:58
 * @description：配置接口过滤token
 * @version:
 */
@Configuration
public class WebConfigura implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加要拦截的路由  excludePathPatterns 不需要拦截的路由
        registry.addInterceptor(new PassportInterceptor()).addPathPatterns("/**").excludePathPatterns("/users/**");
    }


}
