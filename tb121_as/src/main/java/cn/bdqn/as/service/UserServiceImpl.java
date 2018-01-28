package cn.bdqn.as.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bdqn.as.bo.UserDg;
import cn.bdqn.as.dao.UserDao;
import cn.bdqn.as.entity.User;
import cn.bdqn.as.util.MD5Encrypter;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User login(String userCode, String pwd) {
		pwd=MD5Encrypter.encrypt(pwd);
		 
		 
		return userDao.getUserByNameAndPwd(userCode, pwd);
	}

	@Override
	public UserDg showAll() {
		UserDg  userDg=new UserDg();
			userDg.setRows(userDao.getAll());
			userDg.setTotal(userDao.getTotal());
		return userDg;
	}
	
	
}
