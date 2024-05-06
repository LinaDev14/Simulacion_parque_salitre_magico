package com.co.linadev.Salitre_Magico.application.service.attraction;

import com.co.linadev.Salitre_Magico.domain.dto.AttractionDto;

import java.util.List;
import java.util.Optional;

public interface AttractionInterface {

    //Basic CRUD service

    AttractionDto saveAttraction(AttractionDto attractionDto);

    List<AttractionDto> findAllAttractions();

    Optional<AttractionDto> findById(String id);

}
