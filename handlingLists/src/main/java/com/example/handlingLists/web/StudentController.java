package com.example.handlingLists.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.handlingLists.domain.*;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String messages(Model model) {
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Emma","Arolas");
		Student s2 = new Student("Bryan", "Riobeiro");
		Student s3 = new Student("Cyrano","De Bergerac");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		model.addAttribute("students", students);
		return "studentlist";
	}

}
