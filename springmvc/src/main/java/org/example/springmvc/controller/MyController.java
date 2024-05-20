package org.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.springmvc.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

//    @GetMapping("/about")
//    public String about() {
//        return "about";
//    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    //    @GetMapping("/greeting")
//    public String greeting(
//            @RequestParam String name,
//            @RequestParam(name = "age",required = false,defaultValue = "28")int age,Model model) {
//        //http://localhost:8888/greeting?name=jung&age=27
//        // ?name=jung&age=27 쿼리 문자열
//        System.out.println(name);
//        System.out.println(age);
//
//        model.addAttribute("name", name);
//        return "greeting";
//    }
    @GetMapping("/greeting")
    public ModelAndView greeting(@RequestParam String name, ModelAndView modelAndView) {
        System.out.println(name);
        modelAndView.addObject("name", name);
        modelAndView.setViewName("greeting");
        return modelAndView;
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("welcomeMsg","ㅎㅇ");
        List<Item> items = Arrays.asList(
                new Item("pen", 3000),
                new Item("notebook", 2000),
                new Item("excalibur", 1)
        );
        model.addAttribute("itemList",items);

        return "welcome";
    }
}
