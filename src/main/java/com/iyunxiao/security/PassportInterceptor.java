package com.iyunxiao.security;

import com.alibaba.fastjson.JSONObject;
import com.iyunxiao.domain.ServerResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：qianpeng
 * @date ：Created in 2019-07-03 12:22
 * @description：处理token的拦截器
 * @version:
 */
public class PassportInterceptor implements HandlerInterceptor {

    private String tokenName = "token";

    @Override
    //重写前置处理器
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html;charset=UTF-8");//这句话是解决乱码的

        Cookie[] cookies = request.getCookies();
        String token = "";
        if (cookies == null || cookies.length == 0) {
            response.getWriter().write(JSONObject.toJSONString(ServerResponse.createByErrorCodeMessage(403, "请登录后再操作")));
            return false;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(tokenName)) {
                token = cookie.getValue();
            }
        }
        if ("".equals(token)) {
//            response.sendError(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write(JSONObject.toJSONString(ServerResponse.createByErrorCodeMessage(403, "请登录后再操作")));

            return false;
        }

        return true;
    }
}
