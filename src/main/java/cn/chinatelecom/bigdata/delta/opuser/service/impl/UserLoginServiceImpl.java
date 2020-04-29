package cn.chinatelecom.bigdata.delta.opuser.service.impl;
import cn.chinatelecom.bigdata.delta.common.service.dto.RestResult;
import cn.chinatelecom.bigdata.delta.opuser.dao.UserDao;
import cn.chinatelecom.bigdata.delta.opuser.dto.request.UserLoginBody;
import cn.chinatelecom.bigdata.delta.opuser.dto.response.UserVo;
import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import cn.chinatelecom.bigdata.delta.opuser.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserLoginServiceImpl implements UserLoginService {

//    @Resource
    @Autowired
    private UserDao userDao;

    @Override
    public UserVo getUserInfo(UserLoginBody userLoginBody) {
        // 用户信息
        List<User> users = userDao.findByUserName(userLoginBody.getUsername());
        // 账号不存在、密码错误
        String password = userLoginBody.getPassword();
        String username = userLoginBody.getUsername();
        String ReturnPassword = null;
        if(users!=null) {
             ReturnPassword = users.get(0).getPassword();
        }
        if (users == null) {
            log.info("账户不存在");
           RestResult.builder().message("PasswordUtils.java账号不存在");
     }

        if(password.equals(ReturnPassword))
        {
            log.info("密码正确");
            UserVo userVo2 = new UserVo();
            userVo2.setUsername(users.get(0).getUsername());
            userVo2.setPassword(users.get(0).getPassword());
            return userVo2;
        }
        else {
            UserVo userVo1 = new UserVo();
            return userVo1;
        }
    }
}
