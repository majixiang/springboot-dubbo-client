package com.dingxianginc.springboot.dubbo;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dingxianginc.springboot.domain.City;

import com.reger.dubbo.annotation.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author: jixiang.ma@dingxing-inc.com
 * @Date: 2018/7/18 21:00
 * @Copyright: 2018 dingxiang-inc.com Inc. All rights reserved
 **/

@Component
public class CityDubboConsumer implements CommandLineRunner{

    @Reference
    private CityService cityService;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("---------");
        String name = "南京";
        String desc = "冷";
        City ct = cityService.findCityByName(name);
        System.out.println(ct.toString());
    }
}
