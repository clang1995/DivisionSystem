package com.szy.filter;

import com.szy.RespEnum;
import com.szy.vo.Account;
import com.szy.service.IUserService;
import com.szy.util.UserLimitUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by shizhouyong on 2017/1/7.
 */

//@WebFilter(filterName = "AdminFilter", urlPatterns = {"/jg/v/*"})
public class AdminFilter implements Filter {

    private static IUserService userService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        Account account = (Account)request.getSession().getAttribute("account");

        if(account != null) {
            if (UserLimitUtil.verify(account.getLimit(), UserLimitUtil.USER_TEACHER))
                chain.doFilter(req, res);
            else
                res.getWriter().write(RespEnum.NO_ACCESS.toString());
        } else {
            res.getWriter().write(RespEnum.NOT_LOGIN.toString());
        }
    }

    @Override
    public void destroy() {

    }
}