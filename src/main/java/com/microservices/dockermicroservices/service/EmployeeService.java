package com.microservices.dockermicroservices.service;

import com.microservices.dockermicroservices.dto.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO getEmployee(Long id);

}
