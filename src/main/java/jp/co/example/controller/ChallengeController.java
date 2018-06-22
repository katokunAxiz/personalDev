package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.entity.ChallengeInfo;


@Controller
public class ChallengeController {

/*	@Autowired
	private UserInfo userInfo;*/

	@Autowired
	private ChallengeInfo challengeInfo;



/*	@Autowired
	private UserService_PD userService;*/

	@RequestMapping("/question")
	public String form() {

		return "question";
	}

	@RequestMapping(value = "/challenge", method = RequestMethod.POST)
	public String challenge(@RequestParam("object1") String object1,
			@RequestParam("object2") String object2,
			@RequestParam("object3") String object3,
			@RequestParam("purpose") String purpose,
			@RequestParam("trigger") String trigger,
			Model model) {

		try {
//一つだけ片付けるものが入力された場合
			if ((object1 != null && !(object1.isEmpty())) && (object2 == null || object2.isEmpty())
					&& (object3 == null || object3.isEmpty())) {

				//entityに保存する
				challengeInfo.setObject1(object1);
				challengeInfo.setObject2("");
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

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
/*				userService.registerChallenge(object1, "", "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/

				return "challenge";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 != null && !(object2.isEmpty()))
					&& (object3 == null || object3.isEmpty())) {

				challengeInfo.setObject1(object2);
				challengeInfo.setObject2("");
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object2, "", "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
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
				return "challenge";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 == null || object2.isEmpty())
					&& (object3 != null && !(object3.isEmpty()))) {

				challengeInfo.setObject1(object3);
				challengeInfo.setObject2("");
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object3, "", "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
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
				return "challenge";
			}
			//二つだけ片付けるものが入力された場合
			else if ((object1 != null && !(object1.isEmpty())) && (object2 != null && !(object2.isEmpty()))
					&& (object3 == null || object3.isEmpty())) {

				challengeInfo.setObject1(object1);
				challengeInfo.setObject2(object2);
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object1, object2, "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と"+challengeInfo.getObject2()+"を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "challenge";
			}

			else if ((object1 == null || object1.isEmpty()) && (object2 != null && !(object2.isEmpty()))
					&& (object3 != null && !(object3.isEmpty()))) {

				challengeInfo.setObject1(object2);
				challengeInfo.setObject2(object3);
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object2, object3, "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と"+challengeInfo.getObject2()+"を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "challenge";
			}

			else if ((object1 != null && !(object1.isEmpty())) && (object2 == null || object2.isEmpty())
					&& (object3 != null && !(object3.isEmpty()))) {

				challengeInfo.setObject1(object1);
				challengeInfo.setObject2(object3);
				challengeInfo.setObject3("");
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object1, object3, "", purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、2分間で";
				String object = challengeInfo.getObject1() + "と"+challengeInfo.getObject2()+"を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "challenge";
			}
			//三つ全てに片付けるものが入力された場合
			else if ((object1 != null && !(object1.isEmpty())) && (object2 != null && !(object2.isEmpty()))
					&& (object3 != null && !(object3.isEmpty()))) {

				challengeInfo.setObject1(object1);
				challengeInfo.setObject2(object2);
				challengeInfo.setObject3(object3);
				challengeInfo.setPurpose(purpose);
				challengeInfo.setTrigger(trigger);

/*				userService.registerChallenge(object1, object2, object3, purpose, trigger, challengeInfo.getDate(),
						userInfo.getUserName());*/
				String purpose1 = challengeInfo.getPurpose() + "に、";
				String trigger1 = challengeInfo.getTrigger() + "を見たら、3分間で";
				String object = challengeInfo.getObject1() + "と"+challengeInfo.getObject2()+"、"+challengeInfo.getObject3()+"を片付けてください。";

				if (purpose1 != null && !(purpose1.isEmpty())) {
					model.addAttribute("purpose", purpose1);
				}
				if (trigger1 != null && !(trigger1.isEmpty())) {
					model.addAttribute("trigger", trigger1);
				}
				if (object != null && !(object.isEmpty())) {
					model.addAttribute("object", object);
				}
				return "challenge";

			} else{
				model.addAttribute("errmsg", "最低でも一つは入力してください");

				return "question";

			}
		} catch (Exception e) {
			model.addAttribute("errmsg", "新規登録を先に行ってください");
			return "question";
		}

	}
}
