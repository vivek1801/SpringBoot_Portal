package com.mypersonal.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmplyeeService {

	private List<EmployeeBean> employees = new ArrayList<>(Arrays.asList(new EmployeeBean("1", "Vk", "S", "908734243"),
			new EmployeeBean("2", "Rk", "S1", "774573842"), new EmployeeBean("3", "Sk", "S2", "774573834")));
	
	public List<EmployeeBean> getAllEmployees()
	{
		return employees;
	}
	
	public EmployeeBean getEmployee(String id)
	{
		EmployeeBean tempBean=null;
		for(EmployeeBean empBean : employees)
		{
			if(empBean.getEmpId().equals(id))
			{
				tempBean=empBean;
				break;
			}
		}
		
		return tempBean;
	}
	
	public void addEmployeeInList(EmployeeBean empBean)
	{
		employees.add(empBean);
	}
}
