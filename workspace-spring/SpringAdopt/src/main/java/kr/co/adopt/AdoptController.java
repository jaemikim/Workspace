package kr.co.adopt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdoptController {

	@RequestMapping("/index")
	public void index() {
		System.out.println("urlpattern=index.do");
	}
	
	@RequestMapping("/about/about")
	public void about() {
		System.out.println("urlpattern=about.do");
	}

	@RequestMapping("/loss/loss")
	public void loss() {
		System.out.println("urlpattern=loss.do");
	}

	@RequestMapping("/adopt/*")
	public void adopt() {
		System.out.println("urlpattern=adopt.do");
	}
	
	@RequestMapping("/shelter/*")
	public void shelter() {
		System.out.println("urlpattern=shelter.do");
	}

	@RequestMapping("/login/*")
	public void login() {
		System.out.println("urlpattern=login.do");
	}
	
}

