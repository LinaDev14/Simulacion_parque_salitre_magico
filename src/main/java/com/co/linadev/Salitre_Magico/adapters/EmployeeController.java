package com.co.linadev.Salitre_Magico.adapters;


import com.co.linadev.Salitre_Magico.application.service.employee.EmployeeService;
import com.co.linadev.Salitre_Magico.domain.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    //saveEmployee
    //localhost:8080/api/employee/saveEmployee
    @PostMapping("/saveEmployee")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
       return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    //findAllEmployees
    //localhost:8080/api/employee/findAllEmployees
    @GetMapping("/findAllEmployees")
    public ResponseEntity<List<EmployeeDto>> findAllEmployees(){
        return new ResponseEntity<>(employeeService.findAllEmployees(),HttpStatus.OK);
    }

    //findById
    //localhost:8080/api/employee/findById?id={id}
    @GetMapping("/findById")
    public ResponseEntity<Optional<EmployeeDto>> findById(@RequestParam String id){
        return new ResponseEntity<>(employeeService.findById(id),HttpStatus.OK);
    }


}
