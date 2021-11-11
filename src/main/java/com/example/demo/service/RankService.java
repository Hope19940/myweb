package com.example.demo.service;

import com.example.demo.dao.RankDao;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RankDao rankDao;
    public void doService(){
    }
}


