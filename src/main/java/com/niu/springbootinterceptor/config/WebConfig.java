package com.niu.springbootinterceptor.config;

import com.niu.springbootinterceptor.interceptor.MyInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @description:
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/22 3:26 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/22 3:26 下午
 * @updateRemark:
 * @version: 1.0
 **/
@Component
public class WebConfig  implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器并设置拦截的访问路径 *代表全匹配
       // registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/test");
    }
}
