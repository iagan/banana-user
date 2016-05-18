package org.ithinking.banana.user.remote.service;

import org.ithinking.banana.user.remote.dto.UserDTO;

/**
 * @author fuchujian
 */
public interface UserRemoteService {
    /**
     * 根据内部主键获取用户信息
     *
     * @param userId
     * @return
     */
    public UserDTO getUserById(Long userId);

    /**
     * 根据登录ID获取用户信息
     *
     * @param loginId
     * @return
     */
    public UserDTO getUserByLoginId(String loginId);
}
