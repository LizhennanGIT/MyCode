package com.qnvip.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.qnvip.dao.GirlDao;
import com.qnvip.vo.Girl;

@Controller
public class GirlController {
	@Autowired
	private GirlDao girlDao;
	
	@PostMapping("/girlAdd")
	public Girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
		Girl girl =new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girl;
	}
	@GetMapping("/girlInfo")	
	public String girlInfo(Model model){
		List<Girl> list=girlDao.getGirl();
		model.addAttribute("name", "张三");
		return "test";
	}
}
