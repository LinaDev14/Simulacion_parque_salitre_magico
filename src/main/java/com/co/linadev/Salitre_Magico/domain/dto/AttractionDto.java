package com.co.linadev.Salitre_Magico.domain.dto;


import com.co.linadev.Salitre_Magico.domain.valueObjects.AttractionClassification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.AttractionName;
import com.co.linadev.Salitre_Magico.domain.valueObjects.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttractionDto {

    private String id;
    private AttractionName name;
    private String description;
    private AttractionClassification classification;
    private Status status;
    private Integer score;
    private String idEmployee;



}
