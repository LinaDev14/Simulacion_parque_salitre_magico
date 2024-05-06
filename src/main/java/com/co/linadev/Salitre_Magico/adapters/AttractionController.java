package com.co.linadev.Salitre_Magico.adapters;


import com.co.linadev.Salitre_Magico.application.service.attraction.AttractionService;
import com.co.linadev.Salitre_Magico.domain.dto.AttractionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/attraction")
public class AttractionController  {

    private final AttractionService attractionService;

    //saveAttraction
    //localhost:8080/api/attraction/saveAttraction
    @PostMapping("/saveAttraction")
    public ResponseEntity<AttractionDto> saveAttraction(@RequestBody AttractionDto attractionDto){
        return new ResponseEntity<>(attractionService.saveAttraction(attractionDto), HttpStatus.CREATED);
    }
    //findAllAttractions
    //localhost:8080/api/attraction/findAllAttractions
    @GetMapping("/findAllAttractions")
    public ResponseEntity<List<AttractionDto>> findAllAttractions(){
        return new ResponseEntity<>(attractionService.findAllAttractions(),HttpStatus.OK);
    }
    //findById
    //localhost:8080/api/attraction/findById?id={id}
    @GetMapping("/findById")
    public ResponseEntity<Optional<AttractionDto>> findById(@RequestParam String id){
        return new ResponseEntity<>(attractionService.findById(id),HttpStatus.OK);
    }
}
