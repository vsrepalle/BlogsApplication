package com.blogs.service;

import com.blogs.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
     String registerUser(User user);

    String loginUser(User user);
}
