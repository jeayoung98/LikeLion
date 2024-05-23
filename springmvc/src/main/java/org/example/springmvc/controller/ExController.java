package org.example.springmvc.controller;

import org.example.springmvc.domain.Item;
import org.example.springmvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class ExController {
    @GetMapping("/guest/{name}")
    public String guest(@PathVariable String name) {
        System.out.println(name);
        return "redirect:/visits";
    }
    @GetMapping("/products")
    public String products(Model model) {

        model.addAttribute("hi", "상품리스트");
        List<Product> products = Arrays.asList(
                new Product(1, "Apple", 1.20),
                new Product(2, "Banana", 0.75),
                new Product(3, "Cherry", 2.05)
        );
        model.addAttribute("productList", products);

        return "products";
    }

    @GetMapping("/example")
    public String showEx(Model model) {
        model.addAttribute("username", "jung");
        model.addAttribute("isAdmin", true);
        model.addAttribute("languages", new String[]{"English", "Spanish", "German"});
        return "exam";
    }
}
