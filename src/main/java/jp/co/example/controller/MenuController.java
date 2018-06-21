package jp.co.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.example.entity.ChallengeInfo;
import jp.co.example.entity.Challengebunn;
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
	private Challengebunn challengebunn;



	@Autowired
	private UserService_PD userService;



	@GetMapping("/menu")
	public String top(Model model) {

		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		challengeInfo.setDate(sdf1.format(date));

		try{
			userService.register(userInfo.getUserName());
		userService.registerChallenge(
		challengeInfo.getObject1(),
		challengeInfo.getObject2(),
		challengeInfo.getObject3(),
		challengeInfo.getPurpose(),
		challengeInfo.getTrigger(),
		challengeInfo.getDate(),
		userInfo.getUserName());
		}catch(Exception e){
			userService.registerChallenge(
					challengeInfo.getObject1(),
					challengeInfo.getObject2(),
					challengeInfo.getObject3(),
					challengeInfo.getPurpose(),
					challengeInfo.getTrigger(),
					challengeInfo.getDate(),
					userInfo.getUserName());

		}
		String chall=challengebunn.getChallenge();
		model.addAttribute("purpose",challengeInfo.getPurpose());
		model.addAttribute("challenge1",chall);



		return "menu";
	}
}


