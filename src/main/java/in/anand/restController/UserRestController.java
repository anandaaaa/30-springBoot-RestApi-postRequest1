package in.anand.restController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.anand.bindings.User;

@RestController
public class UserRestController {
	
	@PostMapping(value="/saveuser",consumes= {"application/json","application/xml"},produces= {"text/plain"})
	public String saveuser(@RequestBody User user)
	{
		System.out.println(user);
		System.out.println("user saved");
		return "successfulliy completed";
		
	}

}
