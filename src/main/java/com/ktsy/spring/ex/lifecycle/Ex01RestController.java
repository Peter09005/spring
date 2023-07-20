package com.ktsy.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller + ResponseBody 가 자동으로 붙음 
public class Ex01RestController {
	
	@RequestMapping("/lifecycle/ex01/3")
	public Person objectResponse() {
		Person person = new Person("김인규",28);
		return person;
	}
	
	
	//status 코드를 포함한 response 
	// 200 OK 
	// 404 400 500  > ERROR 
	
	@RequestMapping("/lifecycle/ex01/4")
	public ResponseEntity<Person> entityResponse(){
		Person person = new Person("김인규",28);
		
		ResponseEntity<Person> entity = new ResponseEntity(person,HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
}
