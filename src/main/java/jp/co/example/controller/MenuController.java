package jp.co.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.example.entity.ChallengeInfo;
import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;

@Controller
public class MenuController{

	@Autowired
	private UserInfo userInfo;

	@Autowired
	private ChallengeInfo challengeInfo;

/*	@Autowired
	private CleaningInfo cleaningInfo;*/



	@Autowired
	private UserService_PD userService;

	@GetMapping("/success")
	public String top(Model model) {

		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		challengeInfo.setDate(sdf1.format(date));

		userService.registerChallenge(
		challengeInfo.getObject1(),
		challengeInfo.getObject2(),
		challengeInfo.getObject3(),
		challengeInfo.getPurpose(),
		challengeInfo.getTrigger(),
		challengeInfo.getDate(),
		userInfo.getUserName());

		return "menu";
	}
}


