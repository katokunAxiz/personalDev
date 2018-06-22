package jp.co.example.dao.Impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.UserDao;
import jp.co.example.entity.ChallengeInfo;
import jp.co.example.entity.CleaningInfo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CleaningInfo cleaningInfo;

	@Autowired
	private ChallengeInfo challengeInfo;

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

	public int registerChallenge(
			String object1,
			String object2,
			String object3,
			String purpose,
			String trigger,
			String date,
			String user_name) {
		String sql = "INSERT INTO challenge (user_name) VALUES (?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,object1,object2, object3,
				purpose,trigger,date,user_name );
	}

	public ChallengeInfo FindLateChallenge(String name){
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		String sql = "SELECT * "
				+ "	 FROM challenge "
				+ "WHERE user_name = ? "
				+ " ORDER BY date DESC LIMIT 1";
		Map<String,Object>result = jdbcTemplate.queryForMap(sql,name);
		System.out.println("test");
			challengeInfo.setChallenge_id((int) result.get("challenge_id"));
			challengeInfo.setObject1((String) result.get("object1"));
			challengeInfo.setObject2((String) result.get("object2"));
			challengeInfo.setObject3((String) result.get("object3"));
			challengeInfo.setPurpose((String) result.get("purpose"));
			challengeInfo.setTrigger((String) result.get("trigger"));
			challengeInfo.setDate((Date) result.get("date"));
			challengeInfo.setFormatDate((String)sdf1.format(challengeInfo.getDate()));
			challengeInfo.setUser_name((String) result.get("user_name"));


			return challengeInfo;
	}

	public int delete(String name) {
		String sql = "DELETE FROM users WHERE user_name = ?";
		return jdbcTemplate.update(sql, name);
	}

	public int nameChange(String newName , String oldName) {
		String sql = "UPDATE users SET user_name = ? WHERE user_name = ?";
		return jdbcTemplate.update(sql,newName,oldName);
	}

	public int registerHistory(
			String object1,
			String object2,
			String object3,
			String purpose,
			String trigger,
			String date,
			String user_name) {
		String sql = "INSERT INTO cleaning (object1,object2, object3,purpose,trigger,date,user_name) "
				+ "VALUES (?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,object1,object2, object3,
				purpose,trigger,date,user_name);
	}

	public List<CleaningInfo> Find20(String loginUser){

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		String sql = "SELECT (object1,object2,object3,purpose,trigger,date) "
				+ "	 FROM cleaning WHERE user_name = ? ORDER BY date DESC LIMIT 20";
		List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CleaningInfo> cleaningList = new ArrayList<CleaningInfo>();
		for(Map<String,Object> result: resultList) {
			cleaningInfo.setCleaning_id((int) result.get("cleaning_id"));
			cleaningInfo.setObject1((String) result.get("object1"));
			cleaningInfo.setObject2((String) result.get("object2"));
			cleaningInfo.setObject3((String) result.get("object3"));
			cleaningInfo.setPurpose((String) result.get("purpose"));
			cleaningInfo.setTrigger((String) result.get("trigger"));
			cleaningInfo.setDate((Date) result.get("date"));
			cleaningInfo.setFormatDate((String)sdf1.format(cleaningInfo.getDate()));
			cleaningInfo.setUser_name((String) result.get("user_name"));
			cleaningList.add(cleaningInfo);
		}
		return cleaningList;
	}


}



