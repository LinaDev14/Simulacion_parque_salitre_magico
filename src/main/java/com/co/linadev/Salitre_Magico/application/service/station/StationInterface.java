package com.co.linadev.Salitre_Magico.application.service.station;

import com.co.linadev.Salitre_Magico.domain.dto.StationDto;

import java.util.List;
import java.util.Optional;

public interface StationInterface {

    //Basic CRUD service
    StationDto saveStation (StationDto stationDto);
    List<StationDto> findAllStation ();
    Optional<StationDto> findById(String id);
    StationDto updateStation(StationDto stationDto);

}
