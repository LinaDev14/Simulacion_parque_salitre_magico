package com.co.linadev.Salitre_Magico.application.service.customer;

import com.co.linadev.Salitre_Magico.application.mappers.CustomerMapper;
import com.co.linadev.Salitre_Magico.domain.dto.CustomerDto;
import com.co.linadev.Salitre_Magico.domain.repository.CustomerRepository;
import com.co.linadev.Salitre_Magico.domain.utils.Message;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeIdentification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService implements CustomerInterface {

    //Repository
    private final CustomerRepository customerRepository;

    //Mapper
    private final CustomerMapper customerMapper;
    @Override
    public List<CustomerDto> saveAllData(List<CustomerDto> customerDto) {
        return customerRepository.saveAll(customerDto.stream()
                .map(customerMapper.mapToCustomer())
                .collect(Collectors.toList()))
                .stream()
                .map(customerMapper.mapToCustomerDto())
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper.mapToCustomerDto())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerDto> findById(String id) {
        return customerRepository.findById(id)
                        .map(customerMapper.mapToCustomerDto());
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        if(customerDto.getAge()<12){

            customerDto.setInformation(Message.TICKET_CHILD);
            customerDto.setClient(TypeOfClient.CHILD);
            customerDto.setTypeIdentification(TypeIdentification.TI);

        } else if (customerDto.getAge() >= 13 && customerDto.getAge()<= 18){

            customerDto.setClient(TypeOfClient.YOUNG);
            customerDto.setTypeIdentification(TypeIdentification.TI);
            customerDto.setInformation(Message.WELCOME);

        } else {
            customerDto.setTypeIdentification(TypeIdentification.CC);
            customerDto.setInformation(Message.WELCOME);
        }
        return customerMapper.mapToCustomerDto()
                .apply(customerRepository.save(customerMapper.mapToCustomer()
                        .apply(customerDto)));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        if (customerRepository.findById(customerDto.getId()).isEmpty()){

            throw new IllegalArgumentException(Message.CUSTOMER);

        }
        return customerMapper.mapToCustomerDto().apply(customerRepository.save(
                customerMapper.mapToCustomer().apply(customerDto)
        ));
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);

    }

    @Override
    public void deleteAllData() {
        customerRepository.deleteAll();

    }

    @Override
    public Optional<CustomerDto> findCustomerByTicketId(String idTicket) {
        return customerRepository.findById(idTicket)
                .map(customerMapper.mapToCustomerDto());
    }
}
