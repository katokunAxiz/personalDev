package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;

@Controller
public class NameChangeController {
	@Autowired
	private UserInfo userInfo;
	@Autowired
	private UserService_PD userService;

	@RequestMapping("nameChange")
	public String form() {

		return "nameChange";
	}


	@RequestMapping(value = "/nameChange", method = RequestMethod.POST)
	public String returnTop(@RequestParam("newname") String newName,
							Model model) {
		if (newName == null || newName.isEmpty()) {
			model.addAttribute("errmsg", "ニックネームが入力されていません");
			return "nameChange";
		} else {
			userService.nameChange(newName,userInfo.getUserName());
			userInfo.setUserName(newName);
			model.addAttribute("changed", "ニックネームが変更されました");
			return "menu";
		}
	}
}
