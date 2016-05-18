package org.ithinking.banana.user.service;

import org.ithinking.banana.user.model.entity.User;

/**
 * @author fuchujian
 */
public interface UserService {

    /**
     * 根据内部主键获取用户信息
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


    /**
     * 创建新用户
     *
     * @param user
     */
    public void createUser(User user);

}
