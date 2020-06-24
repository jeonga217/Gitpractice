package kh.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String home() {
				// 작업 코드입니다.
		return "home";
	}
	
}
