package com.xiaomi.tianmao.utils;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-26<br>
 * Time: 16:46<br>
 * UpdateDescription：<br>
 */
public class FinalData {

    /**
     * 包名
     */
    private static final String PACKAGENAME = "COM.XIAOMI.TIANMAO";

    /**
     * 字典表里边 对应的日志类型的值
     */
    public static final int TDICTIONARY_NOTICE_TYPE = 2;

    /**
     * 企业用户
     */
    public static final int USER_TYPE_COMPANY = 1;
    /**
     * 污水厂管理
     */
    public static final int USER_TYPE_SEWAGE = 2;
    /**
     * 垃圾厂管理
     */
    public static final int USER_TYPE_GARBAGE = 3;
    /**
     * 三方管委会
     */
    public static final int USER_TYPE_OTHER = 4;
    /**
     * 环保执法管理
     */
    public static final int USER_TYPE_ENVIRONMENTAL = 5;
    /**
     * 系统管理
     */
    public static final int USER_TYPE_SYSTEM = 6;
    /**
     * 垃圾运输单位
     */
    public static final int USER_TYPE_TRANSPORT = 7;


    /**
     * app token
     */
    public static final String SYSTEM_TOKEN = PACKAGENAME + "USER_TOKEN:";


    /**
     * app token 失效时间  秒（12小时）
     */
    public static final int TOKEN_EXPIRY_SECONDS = 43200;


    /**
     * 请求头中的token
     */
    public static final String TOKENHEAD = "Authorization";

    /**
     * 是否删除   是否显示等修饰词
     */
    public static final int TRUE = 1;
    /**
     * 是否删除   是否显示等修饰词
     */
    public static final int FALSE = 0;

    /**
     * 初始化新闻查看次数
     */
    public static final int INIT_SHOW_COUNT = 0;

    /**
     * 极光推送 MASTER_SECRET
     */
    public static final String JPUSH_MASTER_SECRET = "59c7156b714e2f2ec4555d8a";
    /**
     * 极光推送 APP_KEY
     */
    public static final String JPUSH_APP_KEY = "2d628a0a9a902db6fc352935";
}
