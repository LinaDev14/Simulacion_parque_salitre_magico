package com.co.linadev.Salitre_Magico.domain.collections;


import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeIdentification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfEmployee;
import com.co.linadev.Salitre_Magico.domain.valueObjects.WorkingSchedule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "employees")
public class Employee {
    @Id
    private final String id;
    private final String name;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String document;
    private final TypeIdentification identification;
    private final WorkingSchedule schedule;
    private final TypeOfEmployee typeOfEmployee;


}
