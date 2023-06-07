package com.example.iocexam.service;

import com.example.iocexam.dao.UserDao;
import com.example.iocexam.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


 
	@Override
	public void joinUser(User user) {
		//회원가입에 필요한 비지니스가 존재한다면 여기에 구현!! 
		
		//회원가입 절차가 진행되고, 정보를 저장할 필요가 있다면  Dao 에 알맞은 메서드를 호출한다. 
		userDao.addUser(user);
	}

}
