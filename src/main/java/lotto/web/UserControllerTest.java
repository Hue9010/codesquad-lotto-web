package lotto.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControllerTest {
	
	@GetMapping("/users/form")
	public String form() {
		return "user/form";
	}
	
	@GetMapping("/users/login")
	public String login() {
		return "user/login";
	}
	
//	@GetMapping("/users/{userId}/form")
//	public ModelAndView showModify(@PathVariable String userId) {
//		ModelAndView mav = new ModelAndView("/user/updateForm");
//		
//		for(int i = 0; i<users.size(); i++) {
//			if( users.get(i).getUserId().equals(userId) ) {
//				mav.addObject("user",users.get(i));
//				break;
//			}
//		}
//		return mav;
//	}
//	
//	@PostMapping("/update")
//	public ModelAndView update(User user) {
//		for(int i = 0; i<users.size(); i++) {
//			if( users.get(i).getUserId().equals(user.getUserId()) && users.get(i).getPassword().equals(user.getPassword()) ) {
//				users.set(i, user);
//				System.out.println("users siez = " + users.size());
//				break;
//			}
//		}
//		return new ModelAndView("redirect:/users");
//	}
//	
//	@GetMapping("/users/{index}")
//	public ModelAndView show(@PathVariable int index) {
//		System.out.println("index = " + index);
//		ModelAndView mav = new ModelAndView("user/profile");
//		mav.addObject("user", users.get(index)).addObject("user", users.get(index));
//		
//		return mav;
//		
//	}
//	
//	@PostMapping("/users")
//	public ModelAndView create(User user) {
//
//		users.add(user);
//		System.out.println("size : " + users.size());
//		
//		return new ModelAndView("redirect:/users");
//	}
//
////	@GetMapping("/users/{index}")
////	public String show(@PathVariable int index, Model model) {
////		model.addAttribute("user", users.get(index));
////		return "user/profiel";
////	}
////	아래 코드와 같은 일을 한다고 생각하면 된다.(spring 내부서 스티링을 리턴해도 model 을 같이 딸려가는 듯)
//	
//	@GetMapping("/users")
//	public ModelAndView list() {
//		ModelAndView mav = new ModelAndView("user/list");
//		mav.addObject("users", users);
//		return mav;
//	}
}
