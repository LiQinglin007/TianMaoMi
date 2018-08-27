package com.xiaomi.tianmao.dao;

import com.xiaomi.tianmao.bean.TAccountContent;

public interface TAccountContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAccountContent record);

    int insertSelective(TAccountContent record);

    TAccountContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAccountContent record);

    int updateByPrimaryKey(TAccountContent record);
}