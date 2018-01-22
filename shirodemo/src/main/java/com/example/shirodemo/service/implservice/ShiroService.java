package com.example.shirodemo.service.implservice;

import com.example.shirodemo.mapper.ShiroMapper;
import com.example.shirodemo.model.User;
import com.example.shirodemo.service.IShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiroService implements IShiroService {

    @Autowired
    private ShiroMapper shiroMapper;

    @Override
    public User findByUsername(String username) {
        return shiroMapper.findUserByUsername(username);
    }
}
