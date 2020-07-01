package com.sontan.myb.service;

import com.sontan.myb.entity.Commodity;
import com.sontan.myb.utils.PagerResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommodityService {
    public List<Commodity> findAllCommodity();

    //分页
    public PagerResult<Commodity> findPage(Integer pageNo, Integer pageSize);

    public void update(Commodity commodity);

    public Commodity findOne(Long id);

    public void add(Commodity commodity);

    //搜索
    List<Commodity> findNameOrModel(String pro_model);

    //删除
    public void delete(Long[] ids);
}
