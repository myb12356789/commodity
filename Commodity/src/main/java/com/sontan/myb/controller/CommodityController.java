package com.sontan.myb.controller;

import com.sontan.myb.entity.Commodity;
import com.sontan.myb.entity.Result;
import com.sontan.myb.service.CommodityService;
import com.sontan.myb.utils.PagerResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(description="商品信息管理")
@RestController
@RequestMapping("/Commodity")
public class CommodityController {
  
    @Autowired
    CommodityService commodityService;
    @ApiOperation(value = "所有商品列表")
    @GetMapping("/showAllCommodity")
    public List<Commodity> showAllCommodity(){

        return commodityService.findAllCommodity();
    }
    //分页
    @ApiOperation(value = "分页查询")
    @GetMapping("/findPage")
    public PagerResult<Commodity> findPage(Integer pageNo, Integer pageSize){
        if(pageNo<=0)
            pageNo=1;
        if( pageSize<=0)
            pageSize=10;
        PagerResult<Commodity> pagerResult=commodityService.findPage(pageNo,pageSize);
        return pagerResult;
    }
    //修改方法
    @ApiOperation(value = "通过id拿到商品信息")
    @GetMapping("/findOne.do")
    public Commodity findOne(Long id){
        return commodityService.findOne(id);

    }
    @ApiOperation(value = "修改商品信息")
    @PostMapping("/update.do")
    public Result update(@RequestBody Commodity commodity){
        try {
            commodityService.update(commodity);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    //添加信息
    @ApiOperation(value = "添加商品信息")
    @ResponseBody
    @PostMapping("/add.do")
    public Result add(@RequestBody Commodity commodity){
        try {
            commodityService.add(commodity);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"增加失败");
        }
    }
    //条件查询
    @ApiOperation(value = "模糊查询")
    @GetMapping("/findLike")
    public List<Commodity> findNameOrModel(String pro_model){
        return commodityService.findNameOrModel(pro_model);
    }
    //根据id删除信息
    @ApiOperation(value = "根据id删除商品信息")
    @GetMapping("/delete.do")
    public Result delete(Long [] ids){
        try {
           commodityService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }
}
