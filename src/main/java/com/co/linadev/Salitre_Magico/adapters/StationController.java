package com.co.linadev.Salitre_Magico.adapters;


import com.co.linadev.Salitre_Magico.application.service.station.StationService;
import com.co.linadev.Salitre_Magico.domain.dto.StationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/station")
public class StationController {

    private final StationService stationService;

    //SaveStation
    //localhost:8080/api/station/saveStation
    @PostMapping("/saveStation")
    public ResponseEntity<StationDto> saveStation(@RequestBody StationDto stationDto){
        return new ResponseEntity<>(stationService.saveStation(stationDto), HttpStatus.CREATED);
    }

    //findAllStation
    //localhost:8080/api/station/findAllStation
    @GetMapping("/findAllStation")
    public ResponseEntity<List<StationDto>> findAllStation(){
        return new ResponseEntity<>(stationService.findAllStation(),HttpStatus.OK);
    }

    //findById
    //localhost:8080/api/station/findById?id={id}
    @GetMapping("/findById")
    public ResponseEntity<Optional<StationDto>> findById(@RequestParam String id){
        return new ResponseEntity<>(stationService.findById(id),HttpStatus.OK);
    }

    //localhost:8080/api/station/updateStation
    @PutMapping("/updateStation")
    public ResponseEntity<StationDto> updateStation(@RequestBody StationDto stationDto){
        return new ResponseEntity<>(stationService.updateStation(stationDto), HttpStatus.ACCEPTED);

    }
}
