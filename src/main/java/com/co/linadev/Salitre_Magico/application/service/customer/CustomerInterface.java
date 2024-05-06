package com.co.linadev.Salitre_Magico.application.service.customer;

import com.co.linadev.Salitre_Magico.domain.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface CustomerInterface {

    //Basic CRUD service
    List<CustomerDto> saveAllData(List<CustomerDto> customerDto);
    List<CustomerDto> findAllCustomers();
    Optional<CustomerDto> findById(String id);
    CustomerDto saveCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto);
    void deleteCustomer(String id);
    void deleteAllData();

    //Others Methods

    Optional<CustomerDto> findCustomerByTicketId (String idTicket);




}
