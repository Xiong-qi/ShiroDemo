package com.example.shirodemo.service;

import com.example.shirodemo.model.User;

public interface IShiroService {

    public User findByUsername(String username);
}
