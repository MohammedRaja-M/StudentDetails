package com.co.promon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/path")
	public List<Student> getAllStudent(){
		return studentservice.getAllStudent();
	}
	
	@RequestMapping("/path/{id}")
	public Student getStudent(@PathVariable String id) {
		return StudentService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/path")
	public void addStudent(@RequestBody Student cust) {
		studentservice.addStudent(cust);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/path/{id}")
	public void updateStudent(@RequestBody Student cust,@PathVariable String id) {
		studentservice.updateStudent(id,cust);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/path/{id}")
	public void deleteCustomer(@PathVariable String id) {
		studentservice.deleteStudent(id);
	}

}
