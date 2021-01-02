package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

public interface UserAPI {
    // 登录，返回 UserId
    int login(String username, String password);
    // 注册
    boolean register(UserModel userModel);
    // 用户名是否存在
    boolean checkUsername(String username);
    // 查询用户信息
    UserInfoModel getUserInfo(int uuid);
    // 更新用户信息
    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}