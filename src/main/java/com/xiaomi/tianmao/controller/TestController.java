package com.xiaomi.tianmao.controller;


import com.alibaba.da.coin.ide.spi.meta.ResultType;
import com.alibaba.da.coin.ide.spi.standard.ResultModel;
import com.alibaba.da.coin.ide.spi.standard.TaskQuery;
import com.alibaba.da.coin.ide.spi.standard.TaskResult;
import com.alibaba.da.coin.ide.spi.trans.MetaFormat;

import com.google.gson.Gson;
import com.xiaomi.tianmao.paramsbean.AliGenieRequestBean;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-08-24<br>
 * Time: 9:27<br>
 * UpdateDescription：<br>
 */

@RequestMapping("api/test")
@Controller
public class TestController {

    Logger logger = Logger.getLogger(TestController.class);

    /**
     * "测试一下"自定义技能执行路径地址，请求方式为POST请求
     *
     * @param account
     * @return
     */
    @RequestMapping(value = "/sendContent", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel<TaskResult> getResponse1(@RequestBody String account) {
//    String getResponse1(@RequestBody String account) {
        logger.info("TaskQuery:{}" + account.toString());
//         将开发者平台识别到的语义理解的结果（json字符串格式）转换成TaskQuery
//        TaskQuery query = MetaFormat.parseToQuery(account);

//         构建服务返回结果
        ResultModel<TaskResult> resultModel = new ResultModel<TaskResult>();
        try {
            resultModel.setReturnCode("0");
            TaskResult result = new TaskResult();
            AliGenieRequestBean myBean = new Gson().fromJson(account.toString(), AliGenieRequestBean.class);
            result.setReply("三三说:" + myBean.getUtterance());
            result.setResultType(ResultType.RESULT);
            resultModel.setReturnValue(result);
        } catch (Exception e) {
            resultModel.setReturnCode("-1");
            resultModel.setReturnMessage("这里是李小米");
            resultModel.setReturnErrorSolution(e.getMessage());
        }
//         直接返回ResultModel<TaskResult>对象就ok
        return resultModel;
    }
}
