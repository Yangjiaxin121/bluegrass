package com.bluegrass.service;


import com.bluegrass.common.ServerResponse;
import com.bluegrass.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);


    ServerResponse<String> forgetRestPassword(String username, String passwordNew, String forgetToken);


    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer id);

    ServerResponse checkAdminRole(User user);

    ServerResponse checkUserId(Integer userId);


}