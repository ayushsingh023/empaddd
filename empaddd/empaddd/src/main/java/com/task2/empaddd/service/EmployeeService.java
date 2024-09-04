package com.task2.empaddd.service;

import com.task2.empaddd.entity.Employee;
import com.task2.empaddd.exception.ResourceNotFoundException;
import com.task2.empaddd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + empId));
    }
    
    public Employee updateEmployee(Employee employee, Long empId) {
        Employee existingEmployee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + empId));
        existingEmployee.setEmpName(employee.getEmpName());
        existingEmployee.setAddress(employee.getAddress());
        return employeeRepository.save(existingEmployee);
    }
    
    public void deleteEmployee(Long empId) {
        Employee existingEmployee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + empId));
        employeeRepository.delete(existingEmployee);
    }
}
