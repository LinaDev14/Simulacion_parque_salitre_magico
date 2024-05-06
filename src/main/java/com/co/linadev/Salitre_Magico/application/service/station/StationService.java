package com.co.linadev.Salitre_Magico.application.service.station;

import com.co.linadev.Salitre_Magico.application.mappers.StationMapper;
import com.co.linadev.Salitre_Magico.domain.dto.StationDto;
import com.co.linadev.Salitre_Magico.domain.repository.StationRepository;
import com.co.linadev.Salitre_Magico.domain.utils.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StationService implements StationInterface {

    //Repository
    private final StationRepository stationRepository;

    //Mapper
    private final StationMapper stationMapper;


    @Override
    public StationDto saveStation(StationDto stationDto) {
        return stationMapper.mapToStationDto()
                .apply(stationRepository.save(stationMapper.mapToStation()
                        .apply(stationDto)));

    }

    @Override
    public List<StationDto> findAllStation() {
        return stationRepository.findAll()
                .stream()
                .map(stationMapper.mapToStationDto())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<StationDto> findById(String id) {
        return stationRepository.findById(id)
                .map(stationMapper.mapToStationDto());
    }

    @Override
    public StationDto updateStation(StationDto stationDto) {
        if (stationRepository.findById(stationDto.getId()).isEmpty()){
            throw new IllegalArgumentException(Message.STATION);
        }
        return stationMapper.mapToStationDto().apply(stationRepository.save(
                stationMapper.mapToStation().apply(stationDto)
        ));
    }
}
