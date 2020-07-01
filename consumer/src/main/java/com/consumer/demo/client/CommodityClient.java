package com.consumer.demo.client;

import com.consumer.demo.entity.Commodity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "service-commodity",fallback = CommodityClientFallback.class)
public interface CommodityClient {
    @ResponseBody
    @RequestMapping("Commodity/showAllCommodity")
    public String showAllCommodity();




}
