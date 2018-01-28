package cn.bdqn.as.service;

import cn.bdqn.as.bo.UserDg;
import cn.bdqn.as.entity.User;

public interface UserService {
	User login(String userCode ,String pwd);

	UserDg showAll();
}
