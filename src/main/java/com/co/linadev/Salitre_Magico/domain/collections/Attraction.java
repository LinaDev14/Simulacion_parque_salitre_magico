package com.co.linadev.Salitre_Magico.domain.collections;


import com.co.linadev.Salitre_Magico.domain.valueObjects.AttractionClassification;
import com.co.linadev.Salitre_Magico.domain.valueObjects.Status;
import com.co.linadev.Salitre_Magico.domain.valueObjects.AttractionName;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "attractions")
public class Attraction {

    @Id
    private final String id;
    private final AttractionName name;
    private final String description;
    private final AttractionClassification classification;
    private final Status status;
    private final Integer score;
    private final String idEmployee;

}
