package com.co.linadev.Salitre_Magico.domain.collections;


import com.co.linadev.Salitre_Magico.domain.valueObjects.TicketName;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "tickets")
public class Ticket {

    @Id
    private final String id;
    private final TicketName name;
    private final String description;
    private final Integer price;
    private final String code;
    private final Integer stock;
    private final String idStation;

}
