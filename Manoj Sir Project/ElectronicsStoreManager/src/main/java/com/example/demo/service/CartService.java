package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;
import com.example.demo.repository.CartRepository;

@Service
public class CartService {
	 @Autowired
	    private CartRepository cartRepository;

	    public Cart findCartByUser(User user) {
	        return cartRepository.findByUser(user);
	    }

	    public Cart saveCart(Cart cart) {
	        return cartRepository.save(cart);
	    }
}
