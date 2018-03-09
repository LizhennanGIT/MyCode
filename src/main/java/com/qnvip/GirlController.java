package com.qnvip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GirlController {
	@Autowired
	private GirlRepository girlRepository;
	@GetMapping("/getGirls")
	public List<Girl> getGirls(){
		return girlRepository.findAll();
	}
	
	@PostMapping("/girlAdd")
	public Girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
		Girl girl =new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girl;
	}
	@GetMapping("/girlInfo")	
	public String girlInfo(Model model){
		model.addAttribute("name", "ÀîËÄ");
		return "test";
	}
}
