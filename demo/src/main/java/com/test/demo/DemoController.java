package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DemoController {
	@Autowired
	DemoRepository demoRepository;
	@GetMapping("/demo")
	public Iterable<Demo> view() {
		return demoRepository.findAll();
	}
	@PostMapping("/demo")
	public Demo create(@RequestBody Demo demo) {
		return demoRepository.save(demo);

	}
	

}
