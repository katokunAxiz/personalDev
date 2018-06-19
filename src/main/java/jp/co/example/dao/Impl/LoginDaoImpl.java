package jp.co.example.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.LoginDao;


@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String login(String name) {
			String sql="SELECT user_id FROM users WHERE user_name=?";
			return jdbcTemplate.queryForObject(sql,String.class,name);
	}
}

