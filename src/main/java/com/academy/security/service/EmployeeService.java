package com.academy.security.service;

import com.academy.security.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
  List<EmployeeDto> findAll();
}
