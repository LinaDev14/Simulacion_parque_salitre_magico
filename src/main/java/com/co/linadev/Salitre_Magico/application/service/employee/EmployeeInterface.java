package com.co.linadev.Salitre_Magico.application.service.employee;

import com.co.linadev.Salitre_Magico.domain.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeInterface {

    //Basic CRUD Service
    EmployeeDto saveEmployee (EmployeeDto employeeDto);
    List<EmployeeDto> findAllEmployees();
    Optional<EmployeeDto> findById(String id);
}
