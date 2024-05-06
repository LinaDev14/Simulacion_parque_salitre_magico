package com.co.linadev.Salitre_Magico.application.mappers;


import com.co.linadev.Salitre_Magico.domain.collections.Employee;
import com.co.linadev.Salitre_Magico.domain.dto.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeMapper {

    public Function<EmployeeDto, Employee> mapToEmployee(){
        return employeeDto -> new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getPhone(),
                employeeDto.getDocument(),
                employeeDto.getIdentification(),
                employeeDto.getSchedule(),
                employeeDto.getTypeOfEmployee()
        );
    }
    public Function<Employee, EmployeeDto> mapToEmployeeDto(){
        return employee -> new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getDocument(),
                employee.getIdentification(),
                employee.getSchedule(),
                employee.getTypeOfEmployee()

        );
    }
}
