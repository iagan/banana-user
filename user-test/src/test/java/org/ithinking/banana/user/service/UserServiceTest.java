package org.ithinking.banana.user.service;

import org.ithinking.banana.user.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fuchujian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = org.ithinking.banana.user.api.Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    private static  Long userId = 1L;
    private static  String loginId = "testLoginId";

    @Test
    public void testGetUserById(){
        User user = userService.getUserById(userId);
        System.out.println(user);
    }

    @Test
    public void testGetUserByLoginId(){
        User user = userService.getUserByLoginId(loginId);
        System.out.println(user);
    }
}
