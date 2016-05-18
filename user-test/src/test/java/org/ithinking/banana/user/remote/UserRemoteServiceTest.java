package org.ithinking.banana.user.remote;

import com.alibaba.dubbo.config.annotation.Reference;
import org.ithinking.banana.user.Provider;
import org.ithinking.banana.user.remote.dto.UserDTO;
import org.ithinking.banana.user.remote.service.UserRemoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fuchujian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Provider.class)
public class UserRemoteServiceTest {

    private static Long userId = 1L;
    private static String loginId = "testLoginId";

    @Reference
    private UserRemoteService userRemoteService;

    @Test
    public void testGetUserById(){
        UserDTO userDTO = userRemoteService.getUserById(userId);
        System.out.println(userDTO);
    }

    @Test
    public void testGetUserByLoginId(){
        UserDTO userDTO = userRemoteService.getUserByLoginId(loginId);
        System.out.println(userDTO);
    }
}
