package com.mythri.service;

import java.util.List;

import com.mythri.dto.CreateEmpDetails;
import com.mythri.dto.EmployeeRequest;
import com.mythri.dto.ResponseDTO;
import com.mythri.entity.Employee;
import com.mythri.util.UserException;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee) throws UserException;

	public ResponseDTO<Employee> getEmployees(int pageNo);
	
	public CreateEmpDetails getManagerAndDepts();

	public Employee getValidEmpByAuth(Employee employee)throws UserException;
	
	public Employee getEmpById(int id);
	
	public void deleteEmployee(Employee employee);
	
	public Employee getEmpByName(String name);
	
	public Employee updateEmployee(Employee employee) throws UserException;

	public ResponseDTO<Employee> getFilteredEmployees(EmployeeRequest employeeReq);

	ResponseDTO<Employee> getAllEmps(String sortBy);

	public List<Employee> getBasicEmpDetails();

	public boolean changePwd(Employee employee, String oldPass, String newPass);

	public ResponseDTO<Employee> getAllSubordinates(Integer managerId);
}
