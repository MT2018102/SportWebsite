package com.test.product.interceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class LoggingInterceptors extends HandlerInterceptorAdapter {
    private static Logger sportyLogger =
            Logger.getLogger(LoggingInterceptors.class.getName());
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //get all cookies
        //session Id from cookies
        //log Session Id
        //log the request path

        String sessionId = null;
        Cookie[] cookies = request.getCookies();
        if(request.getCookies() != null){
            for(Cookie cookie : cookies){
                if("JSESSIONID".equals(cookie.getName())){
                    sessionId = cookie.getValue();
                }
            }
        }
        sportyLogger.info("Incoming request data: session: "+ sessionId +
                " at " + new Date() + " for " + request.getRequestURI());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        sportyLogger.info("In Post Handler Interceptor");
    }


}
