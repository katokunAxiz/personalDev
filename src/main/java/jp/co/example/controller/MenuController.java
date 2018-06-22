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
public class MenuController {

	@Autowired
	private UserInfo userInfo;

	@Autowired
	private ChallengeInfo challengeInfo;

	@Autowired
	private UserService_PD userService;

	@GetMapping("/challengeConfirm")
	public String challengeConfirm(Model model) {

		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		challengeInfo.setFormatDate(sdf1.format(date));

		//新規登録のとき
		try {
			userService.register(userInfo.getUserName());
			userService.registerChallenge(
					challengeInfo.getObject1(),
					challengeInfo.getObject2(),
					challengeInfo.getObject3(),
					challengeInfo.getPurpose(),
					challengeInfo.getTrigger(),
					challengeInfo.getFormatDate(),
					userInfo.getUserName());

			String object1 = challengeInfo.getObject1();
			String object2 = challengeInfo.getObject2();
			String object3 = challengeInfo.getObject3();

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
//名前の登録がすでにあった場合
		} catch (Exception e) {

			userService.registerChallenge(
					challengeInfo.getObject1(),
					challengeInfo.getObject2(),
					challengeInfo.getObject3(),
					challengeInfo.getPurpose(),
					challengeInfo.getTrigger(),
					challengeInfo.getFormatDate(),
					userInfo.getUserName());
			String object1 = challengeInfo.getObject1();
			String object2 = challengeInfo.getObject2();
			String object3 = challengeInfo.getObject3();

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
		}

		return "menu";
	}

/*	//ログインしたとき
	@GetMapping("/menu")
	public String menu(Model model) {
		String name = userInfo.getUserName();
		if (name != null) {
			userService.FindLateChallenge(name);
			model.addAttribute("username", name);
			return "menu";
		} else {
			userInfo.setUserName(null);
			return "top";

		}

	}*/
}
