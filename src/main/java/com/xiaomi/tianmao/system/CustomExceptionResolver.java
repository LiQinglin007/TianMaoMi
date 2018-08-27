package com.xiaomi.tianmao.system;

import com.alibaba.fastjson.JSONObject;
import com.xiaomi.tianmao.utils.ResponseUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:全局异常监听 <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-08-24<br>
 * Time: 9:02<br>
 * UpdateDescription：<br>
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {

    Logger logger = Logger.getLogger(CustomExceptionResolver.class);

    //系统抛出的异常
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        //handler就是处理器适配器要执行的Handler对象(只有method)
        //解析出异常类型。
        /* 使用response返回 */
        try {
            logger.warn("服务器异常报错！" + ex.toString());
            ResponseJSON responseJSON = ResponseUtils.getExceptionResponseBean("服务器异常");
            response.getWriter().write(JSONObject.toJSONString(responseJSON));
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
        } catch (IOException e) {
            logger.warn("服务器异常！与客户端通讯异常:" + e.toString());
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
