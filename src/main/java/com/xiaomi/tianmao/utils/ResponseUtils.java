package com.xiaomi.tianmao.utils;


import com.xiaomi.tianmao.system.ResponseJSON;

/**
 * 获取返回成功和失败的Bean
 */
public class ResponseUtils {
    private static ResponseJSON mResponseJSON = null;

    /**
     * 获取返回成功的bean
     *
     * @param msg
     * @param bean
     * @return
     */
    public static ResponseJSON getSuccessResponseBean(String msg, Object bean) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.SUCCESS_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(bean);
        return mResponseJSON;
    }


    /**
     * 获取返回成功的bean
     *
     * @param msg
     * @return
     */
    public static ResponseJSON getSuccessResponseBean(String msg) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.SUCCESS_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(null);
        return mResponseJSON;
    }

    /**
     * 获取返回失败的bean
     *
     * @param msg
     * @param bean
     * @return
     */
    public static ResponseJSON getFiledResponseBean(String msg, Object bean) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.FILED_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(bean);
        return mResponseJSON;
    }

    /**
     * 获取返回失败的bean
     *
     * @param msg
     * @return
     */
    public static ResponseJSON getFiledResponseBean(String msg) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.FILED_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(null);
        return mResponseJSON;
    }

    /**
     * 获取返回失败的bean
     *
     * @param msg
     * @return
     */
    public static ResponseJSON getTokenResponseBean(String msg) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.TOKEN_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(null);
        return mResponseJSON;
    }


    /**
     * 获取返回失败的bean
     *
     * @param msg
     * @return
     */
    public static ResponseJSON getExceptionResponseBean(String msg) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.EXCEPTION_CODE);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(null);
        return mResponseJSON;
    }

}
