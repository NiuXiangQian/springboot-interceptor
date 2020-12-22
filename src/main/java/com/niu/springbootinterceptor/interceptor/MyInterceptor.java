package com.niu.springbootinterceptor.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 拦截器
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/22 3:26 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/22 3:26 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class MyInterceptor  implements HandlerInterceptor {

    /**
     * 访问接口之前拦截
     * 可以做登陆判断、访问权限判断、记录日志。。。
     * 方法return true是允许访问接口  return false是拒绝访问
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("准备访问接口");
        return true; //放行所有接口

    }

    //在controller方法执行完毕执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("controller执行完毕");


    }
    //可以在这里捕捉异常
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("页面渲染完成，准备返回给客户端");

    }
}
