package com.co.linadev.Salitre_Magico.domain.dto;

import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeIdentification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.TypeOfEmployee;
import com.co.linadev.Salitre_Magico.domain.valueObjects.WorkingSchedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String id;
    private String name;
    private  String lastName;
    private String email;
    private String phone;
    private String document;
    private TypeIdentification identification;
    private WorkingSchedule schedule;
    private TypeOfEmployee typeOfEmployee;






}
