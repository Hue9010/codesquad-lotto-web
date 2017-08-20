package lotto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lotto.domain.Machine;
import lotto.domain.User;

@Controller
public class LottoController {
	Machine machine;
	User user;

	@PostMapping("/buyLotto")
	public String buyLotto(int inputMoney) {
		machine = new Machine();
		user = new User(inputMoney);
		user.buyLottos(machine);
		return "redirect:/showLotto";
	}
	
	@GetMapping("/showLotto")
	public ModelAndView showLotto() {
		ModelAndView mav = new ModelAndView("lotto/show");
		mav.addObject("buyLottos", user.buyLottos);
		mav.addObject("volume", user.money.lottoVolume());
		return mav;
	}

	@PostMapping("/matchLotto")
	public String matchLotto(String winningNumber) {
		user.matchLottos(machine, winningNumber);
		return "redirect:/result";
	}

	@GetMapping("/result")
	public ModelAndView showResult() {
		ModelAndView mav = new ModelAndView("lotto/result");
		mav.addObject("result", user.result);
		mav.addObject("rate", user.calculateRate());
		return mav;
	}
}
