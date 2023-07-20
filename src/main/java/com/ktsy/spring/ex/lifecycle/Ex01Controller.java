package com.ktsy.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	@ResponseBody
	@RequestMapping("/fruit")
	public Map<String,Integer> map(){
		Map<String,Integer> fruit = new HashMap<>();
		fruit.put("apple", 1000);
		return fruit;
	}
	
	@ResponseBody
	@RequestMapping("/animal")
	public String str() {
		return "동물";
	}
}
