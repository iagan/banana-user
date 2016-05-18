package org.ithinking.banana.user.remote.service.impl;

import org.ithinking.banana.user.remote.dto.UserDTO;
import org.ithinking.banana.user.remote.service.UserRemoteService;
import org.ithinking.banana.user.service.UserService;

/**
 * @author fuchujian
 */
public class UserRemoteServiceImpl implements UserRemoteService {

    private UserService userService;

    @Override
    public UserDTO getUserById(Long userId) {
        return null;
    }

    @Override
    public UserDTO getUserByLoginId(String loginId) {
        return null;
    }
}
