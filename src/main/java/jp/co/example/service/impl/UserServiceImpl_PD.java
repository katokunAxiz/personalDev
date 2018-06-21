package jp.co.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.dao.UserDao;
import jp.co.example.service.UserService_PD;

@Service
public class UserServiceImpl_PD implements UserService_PD {

	@Autowired
	private UserDao userDao;


	@Override
	public String login(String name) {
		return userDao.login(name);
	}

	@Override
	public int register(String nickName) {
		return userDao.register(nickName);
	}
	@Override
	public int delete(String name) {
		return userDao.delete(name);
	}

	@Override
	public int nameChange(String newName,String oldName) {
		return userDao.nameChange(newName,oldName);
	}
}
