package com.consumer.demo.controller;


import com.consumer.demo.client.CommodityClient;
import com.consumer.demo.entity.Commodity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("customer/Commodity")
public class CommodityController {
  @Autowired
  CommodityClient commodityClient;
  //@Autowired
   // private RestTemplate restTemplate;//通过ribbon做负载均衡
//  @Autowired
//  private DiscoveryClient discoveryClient; //包含拉取所有服务信息，通过doscover获取自己想要的服务地址
    @ResponseBody
    @RequestMapping("/showAllCommodity")
    public String showAllCommodity(){
//      List<ServiceInstance> instances = discoveryClient.getInstances("service-commodity");//无论你服务端口如何变，都可获取到
//      ServiceInstance instance = instances.get(0);//解决地址硬编码问题
      //使用负载均衡可直接用application:name:来拉取服务信息
     // return this.restTemplate.getForObject("http://service-commodity/Commodity/showAllCommodity/",List.class);
        return this.commodityClient.showAllCommodity();
    }
//+ instance.getHost() +":" + instance.getPort() +



}
