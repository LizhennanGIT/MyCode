package com.qnvip;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qnvip.dao.GirlDAO;
import com.qnvip.vo.Girl;

@Controller
public class GirlController {
	@Autowired
	private GirlDAO girlDao;
	
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
