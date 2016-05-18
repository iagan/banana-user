package org.ithinking.banana.user.api.controller;

import org.ithinking.banana.comm.XString;
import org.ithinking.banana.user.api.vo.LoginVO;
import org.ithinking.banana.user.api.vo.RegisterVO;
import org.ithinking.banana.user.api.vo.Result;
import org.ithinking.banana.user.model.entity.User;
import org.ithinking.banana.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuchujian
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user/login")
    public Result login(LoginVO loginVO) {
        Result result = new Result();
        if (XString.isEmpty(loginVO.getLoginId(), loginVO.getPassword())) {

        } else {
            User user = userService.getUserByLoginId(loginVO.getLoginId());
            if(user == null){

            }else if(!loginVO.getPassword().equals(user.getPasswd())){

            }else{

            }
        }

        return result;
    }

    @RequestMapping("user/register")
    public Result register(RegisterVO registerVO) {
        Result result = new Result();

        return result;
    }
}
