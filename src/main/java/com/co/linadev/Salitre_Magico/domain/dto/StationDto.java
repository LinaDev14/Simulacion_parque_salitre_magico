package com.co.linadev.Salitre_Magico.domain.dto;


import com.co.linadev.Salitre_Magico.domain.valueObjects.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationDto {


    private String id;
    private String name;
    private String description;
    private Status status;

}
