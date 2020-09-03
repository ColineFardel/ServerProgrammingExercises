package com.example.friendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.friendList.model.*;

@Controller
public class FriendController {
	private List<Friend> friends = new ArrayList<>();
	
	@PostMapping("/index")
	public String friendSubmit(String name) {
		Friend friend = new Friend(name);
		friends.add(friend);
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String friendList(Model model) {
		model.addAttribute("friends", friends);
		return "friendlist";
	}

}
