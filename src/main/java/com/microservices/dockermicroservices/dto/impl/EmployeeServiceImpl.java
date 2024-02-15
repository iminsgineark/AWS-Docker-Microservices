package com.microservices.dockermicroservices.dto.impl;

import com.microservices.dockermicroservices.dto.EmployeeDTO;
import com.microservices.dockermicroservices.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<EmployeeDTO> employeeData;
    public EmployeeServiceImpl(){
        employeeData = new ArrayList<>();
        EmployeeDTO dto1 = new EmployeeDTO();
        dto1.setId(1L);
        dto1.setName("UA");
        dto1.setEmail("ankurjha4025@gmail.com");
        dto1.setDept("DevOps");

        EmployeeDTO dto2 = new EmployeeDTO();
        dto2.setId(2L);
        dto2.setName("Iker Casillas");
        dto2.setEmail("IkerCasillas01@gmail.com");
        dto2.setDept("Real Madrid CF");

        employeeData.add(dto1);
        employeeData.add(dto2);
    }

    @Override
    public EmployeeDTO getEmployee(Long id) {
        return employeeData.stream().filter((emp) -> emp.getId() == id).findAny().get();
    }
}
