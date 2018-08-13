package com.office.filter;

import com.office.pojo.Gl;
import com.office.service.GlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class admFilter implements HandlerInterceptor {

    @Autowired
    private GlService glService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session=httpServletRequest.getSession();
        String name=(String)session.getAttribute("username");
        if (name!=null){
            String contextPath=httpServletRequest.getContextPath();
            if (name.equals(glService.findGlByglname(name).getGlname())){
                return true;
            }
            httpServletResponse.sendRedirect(contextPath+"/");
            return false;
        }
        else {
            String contextPath=httpServletRequest.getContextPath();
            httpServletResponse.sendRedirect(contextPath+"/");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
