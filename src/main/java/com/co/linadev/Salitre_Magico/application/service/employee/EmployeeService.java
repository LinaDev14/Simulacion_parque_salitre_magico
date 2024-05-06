package com.co.linadev.Salitre_Magico.application.service.employee;


import com.co.linadev.Salitre_Magico.application.mappers.EmployeeMapper;
import com.co.linadev.Salitre_Magico.domain.dto.EmployeeDto;
import com.co.linadev.Salitre_Magico.domain.repository.EmployeeRepository;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfEmployee;
import com.co.linadev.Salitre_Magico.domain.valueObjects.WorkingSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeInterface{

    //Repository
    private final EmployeeRepository employeeRepository;

    //Mapper
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        if (employeeDto.getTypeOfEmployee() == TypeOfEmployee.MAINTENANCE_EMPLOYEES){
            employeeDto.setSchedule(WorkingSchedule.EVERY_DAY_24_HRS);
        }
        return employeeMapper.mapToEmployeeDto()
                .apply(employeeRepository.save(employeeMapper.mapToEmployee()
                        .apply(employeeDto)));
    }

    @Override
    public List<EmployeeDto> findAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper.mapToEmployeeDto())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeDto> findById(String id) {
        return employeeRepository.findById(id)
                .map(employeeMapper.mapToEmployeeDto());
    }

}
