package com.co.linadev.Salitre_Magico.domain.collections;

import com.co.linadev.Salitre_Magico.domain.valueObjects.Gender;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeIdentification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfClient;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "customers")
public class Customer {
    @Id
    private final String id;
    private final String name;
    private final String lastName;
    private final String identificationNumber;
    private final TypeIdentification typeIdentification;
    private final String phone;
    private final String email;
    private final Integer age;
    private final Integer height;
    private final String registrationDay;
    private final TypeOfClient client;
    private final Gender gender;
    private final String idTicket;
    private final String information;

}
