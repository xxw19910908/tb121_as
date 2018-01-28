package cn.bdqn.as.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.as.entity.User;

public interface UserDao {
	User getUserByNameAndPwd(@Param("userCode")String userCode,@Param("pwd")String pwd);

	List<User> getAll();
	
	Integer getTotal();
}
