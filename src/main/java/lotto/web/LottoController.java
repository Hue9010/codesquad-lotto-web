package lotto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lotto.domain.Lotto;
import lotto.domain.Machine;
import lotto.domain.User;

@Controller
public class LottoController {
	Machine machine = new Machine();

	@GetMapping("/lotto")
	public ModelAndView showLotto(int inputMoney) {
		ModelAndView mav = new ModelAndView("lotto/showLotto");
		System.out.println("input money : " + inputMoney);
		
		User user = new User(inputMoney);
		user.buyLottos(machine);
		mav.addObject("buyLottos", user.buyLottos);
		return mav;
	}
	
}
