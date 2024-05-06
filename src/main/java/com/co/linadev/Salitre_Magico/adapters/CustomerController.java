package com.co.linadev.Salitre_Magico.adapters;


import com.co.linadev.Salitre_Magico.application.service.customer.CustomerService;
import com.co.linadev.Salitre_Magico.domain.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerService customerService;

    //saveAllData
    //localhost:8080/api/customer/saveAllData
    @PostMapping("/saveAllData")
    public ResponseEntity<List<CustomerDto>> saveAllData(@RequestBody List<CustomerDto> customerDtos){

        return new ResponseEntity<>(customerService.saveAllData(customerDtos), HttpStatus.CREATED);
    }

    //localhost:8080/api/customer/saveCustomer
    @PostMapping("/saveCustomer")
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(customerService.saveCustomer(customerDto), HttpStatus.CREATED);
    }
    //findAllCustomers
    //localhost:8080/api/customer/findAllCustomers
    @GetMapping("/findAllCustomers")
    public ResponseEntity<List<CustomerDto>> findAllCustomers(){
        return new ResponseEntity<>(customerService.findAllCustomers(),HttpStatus.OK);
    }

    //findById
    //localhost:8080/api/customer/findById?id={id}
    @GetMapping("/findById")
    public ResponseEntity<Optional<CustomerDto>> findById(@RequestParam String id){
        return new ResponseEntity<>(customerService.findById(id),HttpStatus.OK);
    }


    //localhost:8080/api/customer/updateCustomer
    @PutMapping("/updateCustomer")
    public ResponseEntity<CustomerDto> updateCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(customerService.updateCustomer(customerDto), HttpStatus.ACCEPTED);

    }

    //localhost:8080/api/customer/deleteCustomer?id={id}
    @DeleteMapping("/deleteCustomer")
    public ResponseEntity<HttpStatus> deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //localhost:8080/api/customer/deleteAllData
    @DeleteMapping("/deleteAllData")
    public ResponseEntity<HttpStatus> deleteAllData(){
        customerService.deleteAllData();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
