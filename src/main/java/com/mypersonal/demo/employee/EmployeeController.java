package com.mypersonal.demo.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmplyeeService emplyeeService;
	
	@RequestMapping("/getAllEmployee")
	List<EmployeeBean> getAllEmployee()
	{
		return emplyeeService.getAllEmployees();		
	}
	
	@RequestMapping("/getEmployee/{id}")
	EmployeeBean getEmployee(@PathVariable String id)
	{
		return emplyeeService.getEmployee(id);		
	}
	@RequestMapping(method=RequestMethod.POST,value="/addEmployee")
	void addEmployee(@RequestBody EmployeeBean emp)
	{
		 emplyeeService.addEmployeeInList(emp);		
	}

}
