package lotto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lotto.domain.Machine;
import lotto.domain.User;

@Controller
public class LottoController {
	Machine machine;
	User user;

	@GetMapping("/lotto")
	public ModelAndView showLotto(int inputMoney) {
		ModelAndView mav = new ModelAndView("lotto/show");

		machine = new Machine();
		user = new User(inputMoney);
		user.buyLottos(machine);
		mav.addObject("buyLottos", user.buyLottos);
		mav.addObject("volume", user.money.lottoVolume());
		return mav;
	}

	@GetMapping("/matchLotto")
	public ModelAndView matchLotto(String inputWinningNumber) {
		ModelAndView mav = new ModelAndView("lotto/result");

		user.matchLottos(machine, inputWinningNumber);
		mav.addObject("result", user.result);
		mav.addObject("rate", user.calculateRate());
		return mav;
	}
}
