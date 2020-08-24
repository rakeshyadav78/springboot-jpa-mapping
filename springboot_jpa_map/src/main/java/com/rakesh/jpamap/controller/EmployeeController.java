package com.rakesh.jpamap.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rakesh.jpamap.entity.Employee;
import com.rakesh.jpamap.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee/")
public class EmployeeController {

	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "saveEmp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmp(@RequestBody Employee employee) {
		log.debug("employee [" + new Gson().toJson(employee) + "]");
		Employee employee2 = null;
		try {
			employee2 = employeeService.saveEmp(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("Return Success!");
		log.debug("employee [" + new Gson().toJson(employee2) + "]");
		return employee2;
	}

	@GetMapping(value = "getAllEmp", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmp() {
		log.debug("getAllEmp() Mehtod Called");
		List<Employee> employees = employeeService.getAllEmp();
		log.debug("Return Success");
		log.debug("employees [" + new Gson().toJson(employees) + "]");
		return employees;

	}

	@GetMapping(value = "getEmpById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmpById(@PathVariable("id") Integer id) {
		log.debug("Id [" + id + "]");
		Employee employee = employeeService.getEmpById(id);
		log.debug("Return Success");
		log.debug("employee [" + new Gson().toJson(employee) + "]");
		return employee;
	}

	@PostMapping(value = "updateById", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public int updateById(@RequestBody Employee employee) {
		log.debug("employee [" + new Gson().toJson(employee) + "]");
		int emp = employeeService.updateById(employee);
		log.debug("Return Success");
		log.debug("emp [" + emp + "]");
		return emp;
	}

	@GetMapping(value = "deleteById")
	public int deleteById(@RequestParam("id") Integer id) {
		log.debug("Id [" + id + "]");
		return employeeService.deletById(id);
	}
}
