package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;
//import jp.co.example.service.InsertService;

@Controller
public class InsertController_PD {

	@Autowired
	private UserInfo userInfo;
	@Autowired
	private UserService_PD userService;

	@RequestMapping("/Challenge")
	public String form() {

		return "challenge";
	}


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String returnTop(@RequestParam("nickname") String nickName,
							Model model) {
		try {
		if (nickName == null || nickName.isEmpty()) {
			model.addAttribute("errmsg", "ニックネームが入力されていません");
			return "register";
		} else {
			userService.register(nickName);
			userInfo.setUserName(nickName);
			model.addAttribute("nickname", nickName);
			return "question";

			}
		}catch(Exception e){
			model.addAttribute("errmsg","すでに使用されているニックネームです");
			return "register";
		}
	}
}
