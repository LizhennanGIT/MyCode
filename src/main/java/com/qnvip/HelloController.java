package com.qnvip;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {
	@Autowired
	private GirlProperties girlProperties;

	@GetMapping("/{id}/say")
	public String say(@PathVariable("id") Integer id) {
		return ""+id;
	}
}
