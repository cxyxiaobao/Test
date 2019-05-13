package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Student;
import com.service.MyService;

@Controller
public class MyController {
   @Autowired
   
   private MyService myservice;
   
   @RequestMapping("listStudent")
   public ModelAndView listCategory(){
       ModelAndView mav = new ModelAndView();
       List<Student> cs= myservice.list();
        
       // ����ת������
       mav.addObject("cs", cs);
       // ����jsp·��
       mav.setViewName("list");
       return mav;
   }
}
