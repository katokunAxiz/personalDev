package jp.co.example.dao;

public interface UserDao {
	public String login(String name);
	public int register(String nickName);
	public int delete(String name);
	public int nameChange(String newName,String oldName);
}
