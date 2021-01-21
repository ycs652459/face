package com.itboyst.facedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UploadController {
    /**
     * 标签用text utext
     * @return
     */
    @GetMapping("/uplaod")
    public String view(){
            return "upload.html";
    }
    @PostMapping("/multipartFile")
    @ResponseBody
    public Object upload (MultipartFile photo) {
        Map<String,Object> map = new HashMap<>(16);
            if (photo!=null){
                String filePath = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getServletContext().getRealPath("/");
                File file = new File(filePath);
                try {
                    photo.transferTo(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return map;
            }else {
                return map;
            }
    }
}
