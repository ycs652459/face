package com.itboyst.facedemo.service.impl;

import com.itboyst.facedemo.dto.Apple;
import com.itboyst.facedemo.service.AppleService;

import java.util.ArrayList;
import java.util.List;

public class AppleServiceImpl implements AppleService {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }

    public List<Apple> filterApples(List<Apple> inventory,AppleService p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){  //  ←─谓词对象封装了测试苹果的条件
                result.add(apple);
            }
        }
        return result;
    }
}
