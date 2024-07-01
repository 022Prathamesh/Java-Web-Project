package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CartService;
import com.example.demo.service.UserService;
import com.example.demo.entity.Cart;
import com.example.demo.entity.User;

@Controller
@RequestMapping("/user/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String viewCart(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.findByUsername(username);
        Cart cart = cartService.findCartByUser(user);
        model.addAttribute("cart", cart);
        return "user/cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "user/checkout";
    }
}
