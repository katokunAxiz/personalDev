package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.entity.ChallengeInfo;
import jp.co.example.entity.UserInfo;
import jp.co.example.service.UserService_PD;

@Controller
public class LoginController_PD {

	@Autowired
	private UserInfo userInfo;
	@Autowired
	private UserService_PD userService;
	@Autowired
	private ChallengeInfo challengeInfo;

	@RequestMapping("/decription")
	public String form() {

		return "decription";
	}


	@GetMapping("/top")
	public String top(Model model) {
		return "top";
	}

	@RequestMapping(value = "/menu", method = RequestMethod.POST)
	public String returnTop(@RequestParam("name") String name,
			Model model) {
		if (name == null || name.isEmpty()) {
			model.addAttribute("errmsg", "名前が入力されていません");
			return "top";
		}

		if (userService.login(name) == "nothing") {
			model.addAttribute("errmsg", "入力された名前のユーザーは存在しません");
			return "top";
		} else {

			String object1 = challengeInfo.getObject1();
			String object2 = challengeInfo.getObject2();
			String object3 = challengeInfo.getObject3();

			userService.FindLateChallenge(name);
	
			userInfo.setUserName(name);
			model.addAttribute("username", name);

			userService.FindLateChallenge(name);
			if ((object1 != null && !(object1.isEmpty())) && (object2 == null || object2.isEmpty())
					&& (object3 == null || object3.isEmpty())) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、1分間で";
				String object = challengeInfo.getObject1() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}

				return "menu";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 != null && !(object2.isEmpty()))
					&& (object3 == null || object3.isEmpty())) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、1分間で";
				String object = challengeInfo.getObject1() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 == null || object2.isEmpty())
					&& (object3 != null && !(object3.isEmpty()))) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、1分間で";
				String object = challengeInfo.getObject1() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";
			}
			//二つだけ片付けるものが入力された場合
			else if ((object1 != null && !(object1.isEmpty())) && (object2 != null && !(object2.isEmpty()))
					&& (object3 == null || object3.isEmpty())) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と" + challengeInfo.getObject2() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 != null && !(object2.isEmpty()))
					&& (object3 != null && !(object3.isEmpty()))) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と" + challengeInfo.getObject2() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";
			}

			else if ((object1 != null && !(object1.isEmpty())) && (object2 == null || object2.isEmpty())
					&& (object3 != null && !(object3.isEmpty()))) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と" + challengeInfo.getObject2() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";
			}
			//三つ全てに片付けるものが入力された場合
			else if ((object1 != null && !(object1.isEmpty())) && (object2 != null && !(object2.isEmpty()))
					&& (object3 != null && !(object3.isEmpty()))) {

				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、3分間で";
				String object = challengeInfo.getObject1() + "と" + challengeInfo.getObject2() + "、"
						+ challengeInfo.getObject3() + "を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "menu";

			}

			return "menu";

		}
	}

}
