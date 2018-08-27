package com.xiaomi.tianmao.utils;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-07-12<br>
 * Time: 10:54<br>
 * UpdateDescription：<br>
 */
public class PageUtil {

    public static HashMap<String, Object> getPageInfoForWeb(PageInfo pageInfo) {
        if (pageInfo == null) {
            return null;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("pageNum", pageInfo.getPageNum());//当前页
        map.put("pageSize", pageInfo.getPageSize());//每页的数量
        map.put("size", pageInfo.getSize());//当前页的数量
        map.put("total", pageInfo.getTotal());//总记录数
        map.put("pages", pageInfo.getPages());//总页数
        map.put("list", pageInfo.getList());//结果集
        map.put("isFirstPage", pageInfo.isIsFirstPage());//是否为第一页
        map.put("isLastPage", pageInfo.isIsLastPage());//是否为最后一页
        map.put("hasPreviousPage", pageInfo.isHasPreviousPage()); //是否有前一页
        map.put("hasNextPage", pageInfo.isHasNextPage());//是否有下一页
        map.put("navigatepageNums", pageInfo.getNavigatepageNums()); //所有导航页号
        return map;
    }

    public static HashMap<String, Object> getPageInfoForApp(PageInfo pageInfo) {
        if (pageInfo == null) {
            return null;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", pageInfo.getTotal());//总记录数
        map.put("pages", pageInfo.getPages());//总页数
        map.put("list", pageInfo.getList());//结果集
        map.put("isLastPage", pageInfo.isIsLastPage());//是否为最后一页
        return map;
    }
}
