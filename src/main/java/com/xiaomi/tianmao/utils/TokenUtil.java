package com.xiaomi.tianmao.utils;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-25<br>
 * Time: 13:21<br>
 * UpdateDescription：<br>
 */
public class TokenUtil {

    /**
     * 系统用户登录
     */
    public final static int SYSTEM_TOKEN = 0x62;
    /**
     * app用户登录
     */
    public final static int APP_TOKEN = 0x63;

    public static String getToken(int userId, int type) {
        String uuid = UUIDUtil.getUUID();
        String token1 = uuid + "," + userId + "," + type;
        String token = MD5Util.convertMD5(token1);
        return token;
    }



}
