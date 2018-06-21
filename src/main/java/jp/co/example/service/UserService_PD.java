package jp.co.example.service;

import java.util.List;

import jp.co.example.entity.CleaningInfo;

public interface UserService_PD {
	public String login(String name);
	public int register(String nickName);
	public int registerChallenge(
			String object1,
			String object2,
			String object3,
			String purpose,
			String trigger,
			String date,
			String user_name);
	public int delete(String name);
	public int nameChange(String newName,String oldName);
	public int registerHistory(
								String object1,
								String object2,
								String object3,
								String purpose,
								String trigger,
								String date,
								String user_name);
	public List<CleaningInfo> Find20(String LoginUser);
}
