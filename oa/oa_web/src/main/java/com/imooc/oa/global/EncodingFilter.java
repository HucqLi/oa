package com.imooc.oa.global;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Hucq
 * @title
 * @Package com.imooc.oa.global
 * @date 2019/5/29 15:04
 */
public class EncodingFilter implements Filter {
    private String encoding = "utf-8";
    public void init(FilterConfig filterConfig) throws ServletException {
        if(filterConfig.getInitParameter("encoding")!=null){
            encoding = filterConfig.getInitParameter("encoding");
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        filterChain.doFilter(request,response);
    }

    public void destroy() {
    }
}
