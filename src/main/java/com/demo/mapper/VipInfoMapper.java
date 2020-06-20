package com.demo.mapper;


import com.demo.model.VipInfo;

public interface VipInfoMapper {
    int deleteByPrimaryKey(Integer vipid);

    int insert(VipInfo record);

    int insertSelective(VipInfo record);

    VipInfo selectByPrimaryKey(Integer vipid);

    int updateByPrimaryKeySelective(VipInfo record);

    int updateByPrimaryKey(VipInfo record);
}