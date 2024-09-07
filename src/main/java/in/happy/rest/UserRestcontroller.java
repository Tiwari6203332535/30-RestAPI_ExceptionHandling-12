package in.happy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.happy.exception.UserNotFoundException;

@RestController
public class UserRestcontroller {
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId")  Integer userId )throws Exception{ //read the data from path variable and give it method parameter
		if(userId==100) {
			return "jhon";
		}else if(userId==200) {
			return "Happy";
		}else {
			throw new UserNotFoundException("user Not Found");
		}
	}

}
