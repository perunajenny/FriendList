package fi.haagahelia.course.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.course.domain.Friend;

@Controller
public class MessageController {
	
	ArrayList<Friend> friends = new ArrayList<>();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	
	public String greetingSubmit(@RequestParam(name="name", required=false, defaultValue="name") String name, Model model) {
		
			Friend friend = new Friend(name);
			friends.add(friend);
		
		model.addAttribute("friend", friend);
		model.addAttribute("friends", friends);
		return "hello";
		
	}
}