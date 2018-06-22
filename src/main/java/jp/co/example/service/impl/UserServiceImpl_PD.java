package jp.co.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.dao.UserDao;
import jp.co.example.entity.ChallengeInfo;
import jp.co.example.entity.CleaningInfo;
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
	public ChallengeInfo FindLateChallenge(String name){
		return userDao.FindLateChallenge(name);
	}
	@Override
	public int registerChallenge(
			String object1,
			String object2,
			String object3,
			String purpose,
			String trigger,
			String date,
			String user_name) {
		return 	userDao.registerChallenge(object1,object2, object3,
				purpose,trigger,date,user_name);
	}
	@Override
	public int delete(String name) {
		return userDao.delete(name);
	}

	@Override
	public int nameChange(String newName,String oldName) {
		return userDao.nameChange(newName,oldName);
	}

	@Override
	public int registerHistory(
			String object1,
			String object2,
			String object3,
			String purpose,
			String trigger,
			String date,
			String user_name) {
		return 	userDao.registerHistory(object1,object2, object3,
				purpose,trigger,date,user_name);
	}

	@Override
	public List<CleaningInfo> Find20(String LoginUser){
		return userDao.Find20(LoginUser);
	}
}
