package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafController {

    @GetMapping(value="/ex02")
    public String thymeleafExample02(Model model){
        ItemDto itemDto=new ItemDto();
        itemDto.setItemDetail("상품 상세 설명");
        itemDto.setItemNm("테스트 상품1");
        itemDto.setPrice(10000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto",itemDto);
        return "thymeleafEx/thymeleafEx02";
    }
    @GetMapping("/ex06")
    public String thymeleafExample06(String param1,String param2,Model model){
        model.addAttribute("param1",param1);
        model.addAttribute("param2",param2);
        return "thymeleafEx/thymeleafEx06";
    }
    @GetMapping("/ex05")
    public String thymeleafExample05(){

        return "thymeleafEx/thymeleafEx05";
    }


    @GetMapping("/ex07")
    public String thymeleafExample07(){
        System.out.println("dd");
        return "thymeleafEx07";
    }

}

