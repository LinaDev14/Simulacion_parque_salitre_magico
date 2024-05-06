package com.co.linadev.Salitre_Magico.application.mappers;

import com.co.linadev.Salitre_Magico.domain.collections.Attraction;
import com.co.linadev.Salitre_Magico.domain.dto.AttractionDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AttractionMapper {

    public Function<AttractionDto, Attraction> mapToAttraction(){

        return attractionDto -> new Attraction(
                attractionDto.getId(),
                attractionDto.getName(),
                attractionDto.getDescription(),
                attractionDto.getClassification(),
                attractionDto.getStatus(),
                attractionDto.getScore(),
                attractionDto.getIdEmployee()
        );
    }
    public Function<Attraction, AttractionDto> mapToAttractionDto(){

        return attraction -> new AttractionDto(
                attraction.getId(),
                attraction.getName(),
                attraction.getDescription(),
                attraction.getClassification(),
                attraction.getStatus(),
                attraction.getScore(),
                attraction.getIdEmployee()
        );
    }
}
