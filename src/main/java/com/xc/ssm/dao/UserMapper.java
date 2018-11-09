package com.xc.ssm.dao;

import com.xc.ssm.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User find(User user);
}
