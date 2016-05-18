package org.ithinking.banana.user.mapper;

import org.ithinking.banana.user.model.entity.User;

/**
 * @author fuchujian
 */
public interface UserMapper {

    /**
     * 根据用户内部ID获取用户信息
     *
     * @param userId
     * @return
     */
    public User getUserById(Long userId);


    /**
     * 根据登录ID获取用户信息
     *
     * @param loginId
     * @return
     */
    public User getUserByLoginId(String loginId);
}
