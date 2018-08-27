package com.xiaomi.tianmao.filter;

import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:解决跨域问题<br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-13<br>
 * Time: 9:53<br>
 * UpdateDescription：<br>
 */
public class SimpleCORSFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreq = (HttpServletRequest) req;
        HttpServletResponse hresp = (HttpServletResponse) res;
        //跨域
        hresp.setHeader("Access-Control-Allow-Origin", "*");
        //跨域 Header
        hresp.setHeader("Access-Control-Allow-Methods", "*");
//        hresp.setHeader("Access-Control-Allow-Headers", "Authentication,Origin, X-Requested-With,Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE,Accept");
        hresp.setHeader("Access-Control-Allow-Headers", "*");

        // 浏览器是会先发一次options请求，如果请求通过，则继续发送正式的post请求
        // 配置options的请求返回
        if ("OPTIONS".equals(hreq.getMethod())) {
            hresp.setStatus(HttpStatus.OK.value());
            hresp.getWriter().write("OPTIONS returns OK");
            return;
        }
        // Filter 只是链式处理，请求依然转发到目的地址。
        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }

}