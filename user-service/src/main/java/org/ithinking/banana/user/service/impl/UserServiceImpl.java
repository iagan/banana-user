package org.ithinking.banana.user.service.impl;

import org.ithinking.banana.user.mapper.UserMapper;
import org.ithinking.banana.user.model.entity.User;
import org.ithinking.banana.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fuchujian
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public User getUserByLoginId(String loginId) {
        return userMapper.getUserByLoginId(loginId);
    }
}
