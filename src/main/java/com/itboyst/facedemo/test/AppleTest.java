package com.itboyst.facedemo.test;

import cn.hutool.core.collection.CollUtil;
import com.itboyst.facedemo.service.AppleService;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

public class AppleTest {
    @Autowired
    AppleService service;
    public static void main(String[] args) {
        List<String> java8 = new ArrayList<String>();
        java8.add("Google ");
        java8.add("Runoob ");
        java8.add("Taobao ");
        java8.add("Baidu ");
        java8.add("Sina ");
        java8.add("back");


        List<String> names2 = new ArrayList<String>();
        names2.add("方法引用1 ");
        names2.add("方法引用2 ");
        names2.add("方法引用3 ");
        names2.add("方法引用4 ");
        names2.add("方法引用5 ");
        // 倒叙
     //   CollUtil.sort(java8,(s1,s2)->s2.compareTo(s1));
        Collections.sort(java8,(s1,s2)->s2.compareTo(s1));
        java8.forEach(item->{
            System.out.println(item);
        });
        names2.forEach(System.out::println);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 7, 8, 9);
        System.out.println("函数式接口");
        System.out.println("输出所有数据map:");
       // eval(list, n->true);
        // stream
        //
        List<Integer> collect = list.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(collect);
        // filter
        long count = list.stream().filter(string -> string == 2).count();
        System.out.println(count);
        //sored
        list.stream().sorted().forEach(System.out::println);
    }

}
