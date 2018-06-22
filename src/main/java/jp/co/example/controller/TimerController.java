package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TimerController {

	@RequestMapping("timer")
	public String form() {

		return "timer";
	}


	@RequestMapping(value = "/timerStop", method = RequestMethod.POST)
	public String returnTop() {


		return "success";
	}
}


