package com.co.linadev.Salitre_Magico.application.service.attraction;


import com.co.linadev.Salitre_Magico.application.mappers.AttractionMapper;
import com.co.linadev.Salitre_Magico.domain.dto.AttractionDto;
import com.co.linadev.Salitre_Magico.domain.repository.AttractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AttractionService implements AttractionInterface{

    //Repository
    private final AttractionRepository attractionRepository;

    //Mapper
    private final AttractionMapper attractionMapper;

    @Override
    public AttractionDto saveAttraction(AttractionDto attractionDto) {
        return attractionMapper.mapToAttractionDto()
                .apply(attractionRepository.save(attractionMapper.mapToAttraction()
                        .apply(attractionDto)));
    }

    @Override
    public List<AttractionDto> findAllAttractions() {
       return attractionRepository.findAll()
                .stream()
                .map(attractionMapper.mapToAttractionDto())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AttractionDto> findById(String id) {
        return attractionRepository.findById(id)
                .map(attractionMapper.mapToAttractionDto());
    }

}
