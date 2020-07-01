package com.consumer.demo.client;

import com.consumer.demo.entity.Commodity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommodityClientFallback implements CommodityClient {
    @Override
    public String showAllCommodity() {

        return "服务忙请稍后再试。。。。";
    }
}
