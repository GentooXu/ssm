package com.xc.ssm.service.imp;

import com.xc.ssm.dao.UserMapper;
import com.xc.ssm.model.User;
import com.xc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean validateUser(User user) {
        return null != userMapper.find(user);
    }
}
