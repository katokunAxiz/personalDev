package jp.co.example.service;

public interface UserService_PD {
	public String login(String name);
	public int register(String nickName);
	public int delete(String name);
	public int nameChange(String newName,String oldName);
}
