package xzw.shuai.ssm.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xzw.shuai.ssm.spring.mvc.po.User;


@RequestMapping("demo")
@Controller
public class DemoController {

	@RequestMapping(value="test")
	public String test(Integer id, String name, User user) {
		return "test";
	}
	@RequestMapping("test2")
	@ResponseBody
	public User test2(User user) {
		return user;
	}
}
