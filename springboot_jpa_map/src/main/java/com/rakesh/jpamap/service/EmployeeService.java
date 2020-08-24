package com.rakesh.jpamap.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rakesh.jpamap.entity.Employee;
import com.rakesh.jpamap.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static Logger log = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmp(Employee employee) {

		Employee employee2 = null;
		try {
			log.debug("employee " + new ObjectMapper().writeValueAsString(employee));
			employee2 = employeeRepository.save(employee);
			log.debug("Return Success");
			log.debug("employee2 [" + new ObjectMapper().writeValueAsString(employee2) + "]");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee2;
	}

	public List<Employee> getAllEmp() {
		List<Employee> employees = employeeRepository.getAllEmployee();
		return employees;
	}

	public Employee getEmpById(Integer id) {
		return employeeRepository.getEmpById(id);
	}

	public int updateById(Employee employee) {
		String gender=employee.getGender().toString();
		return employeeRepository.updateEmpById(employee.getAddress(), employee.getAge(), employee.getEmail(),
				employee.getfName(), gender, employee.getlName(), employee.getMobNum(),
				employee.getIdEmp());
	}
	
	
	public int deletById(Integer id) {
		return employeeRepository.deletById(id);
	}

}
