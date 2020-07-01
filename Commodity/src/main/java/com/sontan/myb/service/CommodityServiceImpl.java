package com.sontan.myb.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sontan.myb.dao.CommodityDao;
import com.sontan.myb.entity.Commodity;
import com.sontan.myb.utils.PagerResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {


    @Resource
    private CommodityDao commodityDao;
   //分页
    @Override
    public PagerResult<Commodity> findPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Page<Commodity> page=(Page<Commodity>) commodityDao.findAllCommodity();
        PagerResult<Commodity> pageResult=new PagerResult<>(page.getTotal(),page.getResult());
        return pageResult;
    }
    //查询所有信息
    @Override
    public List<Commodity> findAllCommodity() {
        return commodityDao.findAllCommodity();
    }

    //根据id选出信息
    @Override
    public Commodity findOne(Long id) {
        return commodityDao.selectByPrimaryKey(id);
    }
    //修改信息
    @Override
    public void update(Commodity commodity) {
        commodityDao.updateByPrimaryKet(commodity);
    }

    //添加商品信息
    @Override
    public void add(Commodity commodity) {

        commodityDao.insert(commodity);

    }
    //根据id删除信息
    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            commodityDao.deleteByPrimaryKey(id);
        }

    }

    //搜索
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Commodity> findNameOrModel(String pro_model) {
        return commodityDao.findNameOrModel(pro_model);
    }
}
