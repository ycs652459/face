package com.itboyst.facedemo.controller;

import com.itboyst.facedemo.dto.Apple;
import com.itboyst.facedemo.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Iterator;

@Controller
public class MemberController {
    /**
     * 标签用text utext
     * @param mid
     * @param model
     * @return
     */
    @GetMapping("/member_add")
    public String view(String mid, Model model){
            return "member_add";
    }
    @PostMapping("/memberAdd")
    @ResponseBody
    public Object add (@Valid Member vo, BindingResult result){
            if (result.hasErrors()){
                Iterator<ObjectError> iterator = result.getAllErrors().iterator();
                while (iterator.hasNext()) {
                    ObjectError next = iterator.next();
                    System.out.println("code"+next.getCode()+",message="+next.getDefaultMessage());
                }
                return result.getAllErrors();
            }else{
                return vo;
            }
    }
}
