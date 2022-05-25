package com.minquanwei.lab2;

import javax.servlet.*;
import java.io.IOException;

public class minquanweiFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("minquanweiFilter--->before chain");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("minquanweiFilter--->after chain");
    }

    @Override
    public void destroy() {

    }
}