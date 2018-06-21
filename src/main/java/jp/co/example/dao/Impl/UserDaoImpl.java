package jp.co.example.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String login(String name) {
		try {
			String sql = "SELECT user_name FROM users WHERE user_name=?";
			return jdbcTemplate.queryForObject(sql, String.class, name);
		} catch (EmptyResultDataAccessException e) {
			return "nothing";
		}
	}

	public int register(String nickName) {
		String sql = "INSERT INTO users (user_name) VALUES (?)";
		return jdbcTemplate.update(sql, nickName);
	}

	public int delete(String name) {
		String sql = "DELETE FROM users WHERE user_name = ?";
		return jdbcTemplate.update(sql, name);
	}

	public int nameChange(String newName , String oldName) {
		String sql = "UPDATE users SET user_name = ? WHERE user_name = oldName";
		return jdbcTemplate.update(sql,newName,oldName);
	}

}

