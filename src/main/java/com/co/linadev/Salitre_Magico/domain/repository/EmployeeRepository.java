package com.co.linadev.Salitre_Magico.domain.repository;

import com.co.linadev.Salitre_Magico.domain.collections.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {



}
