package com.xiaomi.tianmao.utils;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-26<br>
 * Time: 16:48<br>
 * UpdateDescription：<br>
 */
public class JedisClientUtil {

    /**
     * 获取keys
     *
     * @param pattren 表达式 例如:*全部
     * @return
     * @author: Eason
     * @Createtime: 2016年1月8日
     */
    public static List<String> getAllKeys(String pattren) {
        Jedis jedis = RedisPoolUtil.getConn();
        List<String> list = null;
        Set<String> set = jedis.keys(pattren);
        if (set != null) {
            list = new ArrayList();
            for (Iterator it = set.iterator(); it.hasNext(); ) {
                list.add(it.next().toString());
            }
        }
        RedisPoolUtil.closeConn();
        return list;
    }

    /**
     * 获取String类型 value
     *
     * @param key
     * @return
     * @author: Eason
     * @Createtime: 2016年1月8日
     */
    public synchronized static String getString(String key) {
        Jedis jedis = RedisPoolUtil.getConn();
        String value = jedis.get(key);
        return value;
    }


    /**
     * 保存String类型
     *
     * @param key
     * @param seconds 秒
     * @return 1成功 0设置失效时间失败 -1保存失败
     * @author: Eason
     * @Createtime: 2016年1月8日
     */
    public static long saveString(String key, String value, int seconds) {
        Jedis jedis = RedisPoolUtil.getConn();

        long result = 1;
        String res = jedis.set(key, value);
        if (!"OK".equals(res)) {
            result = -1;// 保存失败
        } else {
            // 设置失效时间
            if (seconds > 0) {
                result = jedis.expire(key, seconds);// 1成功，0失败
            }
        }
        return result;
    }

    /**
     * 设置key失效时间
     *
     * @param key
     * @param seconds
     * @return 1成功 0失败
     * @author: Eason
     * @Createtime: 2016年1月8日
     */
    public static long setExpiryTime(String key, int seconds) {
        Jedis jedis = RedisPoolUtil.getConn();
        long result = jedis.expire(key, seconds);
        return result;
    }


    /**
     * 根据key删除数据
     *
     * @param key
     * @return  1成功0失败
     * @author: Eason
     * @Createtime: 2016年1月8日
     */
    public static long delteBykey(String key) {
        Jedis jedis = RedisPoolUtil.getConn();
        long result = jedis.del(key);
        return result;
    }
}
