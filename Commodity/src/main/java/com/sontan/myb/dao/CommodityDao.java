package com.sontan.myb.dao;

import com.sontan.myb.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
@Mapper
public interface CommodityDao {
    //查询列表
    public List<Commodity> findAllCommodity();
    //根据id进行查询
    public Commodity selectByPrimaryKey(Long id);
    //修改保存
    public void updateByPrimaryKet(Commodity commodity);
    //添加
    public void insert(Commodity commodity);

    //根据名称和型号进行模糊查询
    List<Commodity> findNameOrModel(@Param("pro_model") String pro_model);
    //根据id删除信息
    public void deleteByPrimaryKey(Long ids);
}