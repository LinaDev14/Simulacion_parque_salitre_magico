package com.co.linadev.Salitre_Magico.domain.collections;


import com.co.linadev.Salitre_Magico.domain.valueObjects.Status;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "stations")
public class Station {

    @Id
    private final String id;
    private final String name;
    private final String description;
    private final Status status;
}
