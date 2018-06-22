package jp.co.example.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ChallengeInfo {

	private int challenge_id;
	private String object1;
	private String object2;
	private String object3;
	private String purpose;
	private String trigger;
	private Date date;
	private String formatDate;
	private String user_name;



	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}




	public int getChallenge_id() {
		return challenge_id;
	}

	public void setChallenge_id(int challenge_id) {
		this.challenge_id = challenge_id;
	}

	public String getObject1() {
		return object1;
	}

	public void setObject1(String object1) {
		this.object1 = object1;
	}

	public String getObject2() {
		return object2;
	}

	public void setObject2(String object2) {
		this.object2 = object2;
	}

	public String getObject3() {
		return object3;
	}

	public void setObject3(String object3) {
		this.object3 = object3;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFormatDate() {
		return formatDate;
	}

	public void setFormatDate(String formatDate) {
		this.formatDate = formatDate;
	}


}