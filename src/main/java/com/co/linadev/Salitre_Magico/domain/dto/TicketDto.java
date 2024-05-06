package com.co.linadev.Salitre_Magico.domain.dto;


import com.co.linadev.Salitre_Magico.domain.valueObjects.TicketName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private String id;
    private TicketName name;
    private String description;
    private Integer price;
    private String code;
    private Integer stock;
    private String idStation;

}
