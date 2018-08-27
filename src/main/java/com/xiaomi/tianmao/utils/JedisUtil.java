package com.xiaomi.tianmao.utils;

import java.util.List;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-27<br>
 * Time: 13:56<br>
 * UpdateDescription：<br>
 */
public class JedisUtil {
    /**
     * 获取系统用户id
     *
     * @param token
     * @return
     */
    public static String getTokenValue(String token) {
        return JedisClientUtil.getString(FinalData.SYSTEM_TOKEN + token);
    }


    /**
     * 通过key来更新有效时间
     *
     * @param key
     */
    public static void setTokenTime(String key) {
        JedisClientUtil.setExpiryTime(key, FinalData.TOKEN_EXPIRY_SECONDS);
    }

    /**
     * 保存token
     *
     * @param token      token
     * @param userId     用户id
     * @param systemRole 用户角色id
     * @param companyId  对应企业id
     */
    public static void saveUserToken(String token, String userId, int systemRole, String companyId) {
        JedisClientUtil.saveString(FinalData.SYSTEM_TOKEN + token, userId + "," + systemRole + "," + companyId, FinalData.TOKEN_EXPIRY_SECONDS);
    }

    /**
     * 获取用户id
     *
     * @param token
     * @return
     */
    public static String getUserId(String token) {
        String tokenValue = getTokenValue(token);
        if (!CheckStringEmptyUtils.isEmpty(tokenValue)) {
            String[] split = tokenValue.split(",");
            if (split.length == 3) {
                return split[0];
            }
        }
        return "";
    }

    /**
     * 获取用户角色
     *
     * @param token 当前登录用户的token
     * @return -1:获取失败
     */
    public static int getUserSystemRole(String token) {
        String tokenValue = getTokenValue(token);
        if (!CheckStringEmptyUtils.isEmpty(tokenValue)) {
            String[] split = tokenValue.split(",");
            if (split.length == 3) {
                return Integer.parseInt(split[1]);
            }
        }
        return -1;
    }

    /**
     * 获取用户对应企业id
     *
     * @param token 当前登录用户的token
     * @return 空串:获取失败
     */
    public static String getUserCompanyId(String token) {
        String tokenValue = getTokenValue(token);
        if (!CheckStringEmptyUtils.isEmpty(tokenValue)) {
            String[] split = tokenValue.split(",");
            if (split.length == 3) {
                return split[2];
            }
        }
        return "";
    }


    /**
     * 获取所有系统用户token
     *
     * @return
     */
    public static List<String> getAllSystemToken() {
        return JedisClientUtil.getAllKeys(FinalData.SYSTEM_TOKEN + "*");
    }

}
