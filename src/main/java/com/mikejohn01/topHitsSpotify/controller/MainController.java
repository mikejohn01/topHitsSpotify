package com.mikejohn01.topHitsSpotify.controller;

import com.mikejohn01.topHitsSpotify.dto.ResponseDto;
import com.mikejohn01.topHitsSpotify.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MainController {

    private final MainService mainService;

    @GetMapping("/{colname}")
    public ResponseEntity getMain(@PathVariable("colname") String colname,
                                  @RequestParam( value="year", required = false) Integer year){
        ResponseDto responseDto = mainService.calculate(colname, year);
        return new ResponseEntity(responseDto, HttpStatus.OK);
    }
}
