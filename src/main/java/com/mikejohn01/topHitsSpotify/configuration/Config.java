package com.mikejohn01.topHitsSpotify.configuration;

import com.mikejohn01.topHitsSpotify.dto.DataSetEnum;
import com.mikejohn01.topHitsSpotify.service.MainService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

@RequiredArgsConstructor
@Configuration
public class Config {
    private final MainService mainService;

    @Value("${application.dataset-path}")
    private String dataSetPath;

    @Bean
    CSVParser dataSet () {

////        BufferedReader reader = Files.newBufferedReader(Paths.get("songs_normalize.csv"));
//        try {
//            BufferedReader reader = Files.newBufferedReader(Paths.get(dataSetPath));
//            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(DataSetEnum.class).withIgnoreHeaderCase().withTrim());
////        String filePath = "";
////        return mainService.parseDataSet(dataSetPath);
//            return csvParser;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
        return null;
    }
}
