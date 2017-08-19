package lotto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "/index";
	}

	@GetMapping("/index")
	public String homeIndex() {
		return "/index";
	}
}
