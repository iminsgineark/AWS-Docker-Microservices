package com.microservices.dockermicroservices.controller;

import com.microservices.dockermicroservices.dto.EmployeeDTO;
import com.microservices.dockermicroservices.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping("{emp-id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable("{emp-id}") Long id){
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

}
