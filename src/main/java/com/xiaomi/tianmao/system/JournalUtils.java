package com.xiaomi.tianmao.system;

import com.alibaba.da.coin.ide.spi.standard.ResultModel;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 记录出参
 * 这个 ResponseBodyAdvice 只支持 @ResponseBody 注解的 controller 方法
 * RequestBodyAdvice
 * RequestBodyAdvice 只支持带有 @RequestBody 注解的 controller 方法参数的方法，同时上报的数据必须是 json or xml
 * 想要用这两个实现 http 内容的加密解密，是很有局限性的。并不支持表单 post 请求
 */

@ControllerAdvice
public class JournalUtils implements ResponseBodyAdvice<ResultModel> {

    Logger logger = Logger.getLogger(JournalUtils.class);

    //这个方法表示对于哪些请求要执行beforeBodyWrite，返回true执行，返回false不执行
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public ResultModel beforeBodyWrite(ResultModel body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //出参
        String string = new Gson().toJson(body);
        logger.warn("出参：" + string);
        return body;
    }
}
