package com.example.demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDao;
import com.example.demo.entites.Test;

@RestController
@RequestMapping("/test")
public class testController {
	@Autowired
	private TestDao testDao;
	
	
	@GetMapping("/search")
	public String test() {
		Test test=new Test();
		test.setNo("6454");
		testDao.save(test);
		
		Test fin=testDao.findById(1L).get();
		
		return fin.getNo();
	}
}
