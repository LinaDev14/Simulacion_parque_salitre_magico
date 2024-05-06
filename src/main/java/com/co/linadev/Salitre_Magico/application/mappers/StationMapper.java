package com.co.linadev.Salitre_Magico.application.mappers;


import com.co.linadev.Salitre_Magico.domain.collections.Station;
import com.co.linadev.Salitre_Magico.domain.dto.StationDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StationMapper {
    public Function<StationDto, Station> mapToStation(){
        return stationDto -> new Station(
                stationDto.getId(),
                stationDto.getName(),
                stationDto.getDescription(),
                stationDto.getStatus()
        );
    }
    public Function<Station, StationDto> mapToStationDto(){
        return station -> new StationDto(
                station.getId(),
                station.getName(),
                station.getDescription(),
                station.getStatus()

        );
    }
}
