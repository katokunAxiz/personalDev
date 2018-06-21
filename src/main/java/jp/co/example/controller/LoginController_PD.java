package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;

@Controller
public class LoginController_PD {

	@Autowired
	private UserInfo userInfo;
	@Autowired
	private UserService_PD loginService;

	@GetMapping("/top")
	public String top(Model model) {
		return "top";
	}

	@RequestMapping(value = "/top", method = RequestMethod.POST)
	public String returnTop(@RequestParam("name") String name,
			Model model) {
		if (name == null || name.isEmpty()) {
			model.addAttribute("errmsg", "名前が入力されていません");
			return "top";
		}

		if (loginService.login(name) == "nothing") {
			model.addAttribute("errmsg", "入力された名前のユーザーは存在しません");
			return "top";
		} else {

			userInfo.setUserName(name);
			model.addAttribute("username", name);
			return "menu";

		}
	}

}
