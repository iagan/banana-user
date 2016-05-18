package org.ithinking.banana.user.service.impl;

import org.ithinking.banana.user.model.entity.User;
import org.ithinking.banana.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author fuchujian
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User getUserByLoginId(String loginId) {
        return null;
    }
}
