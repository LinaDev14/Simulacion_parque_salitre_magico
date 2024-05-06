package com.co.linadev.Salitre_Magico.application.mappers;

import com.co.linadev.Salitre_Magico.domain.collections.Customer;
import com.co.linadev.Salitre_Magico.domain.dto.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component
public class CustomerMapper {

    public Function<CustomerDto, Customer> mapToCustomer(){

        return customerDto -> new Customer(
                customerDto.getId(),
                customerDto.getName(),
                customerDto.getLastName(),
                customerDto.getIdentificationNumber(),
                customerDto.getTypeIdentification(),
                customerDto.getPhone(),
                customerDto.getEmail(),
                customerDto.getAge(),
                customerDto.getHeight(),
                customerDto.getRegistrationDay(),
                customerDto.getClient(),
                customerDto.getGender(),
                customerDto.getIdTicket(),
                customerDto.getInformation()
        );

    }
    public Function<Customer, CustomerDto> mapToCustomerDto(){
        return customer -> new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getLastName(),
                customer.getIdentificationNumber(),
                customer.getTypeIdentification(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAge(),
                customer.getHeight(),
                customer.getRegistrationDay(),
                customer.getClient(),
                customer.getGender(),
                customer.getIdTicket(),
                customer.getInformation()
        );
    }



}
