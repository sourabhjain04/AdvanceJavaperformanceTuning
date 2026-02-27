package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.Order;
import com.example.demo.UserDTO;
import com.example.demo.OrderDTO;
import com.example.demo.UserRepository;

import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO getUserById(Long id) {

        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Convert Entity → DTO
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        dto.setOrders(
                user.getOrders().stream().map(order -> {
                    OrderDTO orderDTO = new OrderDTO();
                    orderDTO.setId(order.getId());
                    orderDTO.setProductName(order.getProductName());
                    orderDTO.setPrice(order.getPrice());
                    return orderDTO;
                }).collect(Collectors.toList())
        );

        return dto;
    }
}