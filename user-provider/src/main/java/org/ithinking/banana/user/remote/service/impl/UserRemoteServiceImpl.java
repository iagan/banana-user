package org.ithinking.banana.user.remote.service.impl;

import org.ithinking.banana.comm.BeanMapper;
import org.ithinking.banana.user.model.entity.User;
import org.ithinking.banana.user.remote.Constant;
import org.ithinking.banana.user.remote.dto.UserDTO;
import org.ithinking.banana.user.remote.service.UserRemoteService;
import org.ithinking.banana.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fuchujian
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = UserRemoteService.class, registry = Constant.DUBBO_REGISTRY)
public class UserRemoteServiceImpl implements UserRemoteService {

    @Autowired
    private UserService userService;

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userService.getUserById(userId);
        UserDTO UserDTO = null;
        if (user != null) {
            UserDTO = BeanMapper.copyTo(user, UserDTO.class);
        }
        return UserDTO;
    }

    @Override
    public UserDTO getUserByLoginId(String loginId) {
        User user = userService.getUserByLoginId(loginId);
        UserDTO UserDTO = null;
        if (user != null) {
            UserDTO = BeanMapper.copyTo(user, UserDTO.class);
        }
        return UserDTO;
    }
}
