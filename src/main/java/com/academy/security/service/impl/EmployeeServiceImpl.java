package com.academy.security.service.impl;

import com.academy.security.dto.EmployeeDto;
import com.academy.security.model.repository.EmployeeRepository;
import com.academy.security.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;

  @Override
  public List<EmployeeDto> findAll() {
    var employees = employeeRepository.findAll();
    var employeesDto = new ArrayList<EmployeeDto>();
    employees.forEach(employee -> {
      var employeeDto = new EmployeeDto();
      employeeDto.setName(employee.getName());
      employeeDto.setYear(employee.getYear());
      employeeDto.setSalary(employee.getSalary());
      employeeDto.setEmail(employee.getEmail());

      employeesDto.add(employeeDto);
    });

    return employeesDto;
  }
}
