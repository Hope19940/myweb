package com.example.demo;

import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloWorldController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    @ResponseBody
    public Object search(
            HttpServletRequest request, HttpServletResponse response
            )
    {
        return userMapper.getUserById(1);

//        HashMap<String, Object> result;
//        result = new HashMap<>();
//        result.put("result", Arrays.asList("aaa","bbb","ccc"));
//        return result;
    }
}