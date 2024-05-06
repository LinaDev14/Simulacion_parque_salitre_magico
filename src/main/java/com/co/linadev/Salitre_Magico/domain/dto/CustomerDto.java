package com.co.linadev.Salitre_Magico.domain.dto;

import com.co.linadev.Salitre_Magico.domain.valueObjects.Gender;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeIdentification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfClient;
import lombok.*;


@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String id;
    private String name;
    private String lastName;
    private String identificationNumber;
    private TypeIdentification typeIdentification;
    private String phone;
    private String email;
    private Integer age;
    private Integer height;
    private String registrationDay;
    private TypeOfClient client;
    private Gender gender;
    private String idTicket;
    private String information;

}
