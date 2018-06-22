package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;

public class DeleteController {
	@Controller
	public class InsertController_PD {

		@Autowired
		private UserInfo userInfo;
		@Autowired
		private UserService_PD userService;

		@RequestMapping("/delete")
		public String form() {

			return "deleteConfirm";
		}


		@RequestMapping("/deleter")
		public String delete() {

			userService.delete(userInfo.getUserName());
			userInfo.setUserName(null);
			return "deleteResult";
		}

	}
}
