package org.ithinking.banana.user.service;

import org.ithinking.banana.user.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author fuchujian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = org.ithinking.banana.user.api.Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    private static Long userId = 1L;
    private static String loginId = "testLoginId";

    @Test
    public void testCreateUser() {
        User user = userService.getUserById(userId);
        if (user == null) {
            user = new User();
            user.setUserId(userId);
            user.setLoginId(loginId);
            user.setPasswd("123456");
            user.setNickName("test");
            user.setMobile("13610276655");
            user.setEmail("vajava@126.com");
            user.setSex("0");
            user.setAreaCode("1000010");
            user.setCreateTime(new Date());
            userService.createUser(user);
        }
    }

    @Test
    public void testGetUserById() {
        User user = userService.getUserById(userId);
        System.out.println(user);
    }

    @Test
    public void testGetUserByLoginId() {
        User user = userService.getUserByLoginId(loginId);
        System.out.println(user);
    }
}
