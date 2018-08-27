package com.xiaomi.tianmao.utils;

import java.util.UUID;

/**
 * Filename: UUIDUtil.java <br>
 * <p>
 * Description: <br>
 *
 * @author: NQY <br>
 * @version: 1.0 <br>
 * @Createtime: Jul 10, 2014 <br>
 * @Copyright: Copyright (c)2014 by nqy <br>
 */

public class UUIDUtil {

    /**
     * 获取uuid
     *
     * @return
     * @author: NQY
     * @Createtime: Jul 10, 2014
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

    /**
     * @param args
     * @author: NQY
     * @Createtime: Jul 10, 2014
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String uuid = getUUID();
            System.out.println(i + "uuid:" + uuid);
        }
    }

}
