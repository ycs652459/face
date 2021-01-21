package com.itboyst.facedemo.controller;

import com.itboyst.facedemo.dto.Apple;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class thymeleafController {
    /**
     * 标签用text utext
     * @param mid
     * @param model
     * @return
     */
    @GetMapping("/view")
    public String view(String mid, Model model){
            model.addAttribute("url","www.baidu.com");
            model.addAttribute("html","<h1><span style='color:red;'>这是html页面</span></h1>");
            return "thymeleaf";
    }

    /**
     * 接收request
     * @return
     */
    @GetMapping("/attr")
    public String attr(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.setAttribute("requestMessage","request");
        request.getSession().setAttribute("sessionMessage","session");
        request.getServletContext().setAttribute("applicationMessage","application");
        return "thymeleaf";
    }

    /**
     *  对象赋值
     * @param model
     * @return
     */
    @GetMapping("/model")
    public String model(Model model){
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(16);
        model.addAttribute("model",apple);
        return "thymeleaf";
    }

    /**
     * include
     * @param model
     * @return
     */
    @GetMapping("/include")
    public String include(Model model){

        return "thymeleaf";
    }
}
