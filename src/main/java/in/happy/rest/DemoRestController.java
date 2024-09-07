package in.happy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	  @GetMapping("/")
	public String getWelcomeMsg() {
		String msg = "Welcome to india";
		int i= 10/0;
		return msg;
	}

}
