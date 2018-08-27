package com.xiaomi.tianmao.utils;


/**
 * 类描述：检查字符串工具类
 * 作  者：Admin or 李小米
 * 时  间：2017/10/10
 * 修改备注：
 */
public class CheckStringEmptyUtils {
    public static String ListSuccess = "NOHAVEEMPTY";

    /**
     * 检查字符串是不是空的
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 ? true : false;
    }

    /**
     * 检查两个字符串是否相同
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else {
            return str1.equals(str2) ? true : false;
        }
    }


    /**
     * 检查字符串长度
     *
     * @param beans
     * @return
     */
    public static String checkStringList(CheckStringBean... beans) {
        for (CheckStringBean bean : beans) {
            if (isEmpty(bean.content)) {
                return bean.prompt;
            }
        }
        return ListSuccess;
    }


    /**
     * 检查字符串长度
     *
     * @param beans
     * @return
     */
    public static String checkStringLengList(CheckStringLengBean... beans) {
        for (CheckStringLengBean bean : beans) {
            if (isEmpty(bean.content)) {
                return bean.prompt;
            } else {
                if (bean.content.length() < bean.minLeng || bean.content.length() > bean.maxLeng) {
                    return bean.prompt;
                }
            }
        }
        return ListSuccess;
    }


    /**
     * 检查是否为空的bean
     */
    public static class CheckStringBean {
        String content;
        String prompt;

        public CheckStringBean(String content, String prompt) {
            this.content = content;
            this.prompt = prompt;
        }
    }

    /**
     * 检查字符串长度的bean
     */
    public static class CheckStringLengBean extends CheckStringBean {
        int minLeng;
        int maxLeng;

        public CheckStringLengBean(String content, String prompt, int minLeng, int maxLeng) {
            super(content, prompt);
            this.minLeng = minLeng;
            this.maxLeng = maxLeng;
        }
    }
}
