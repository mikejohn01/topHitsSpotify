package com.mikejohn01.topHitsSpotify.service;

import com.mikejohn01.topHitsSpotify.dto.DataSetEnum;
import com.mikejohn01.topHitsSpotify.dto.ResponseDto;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    public ResponseDto calculate(String colname, Integer year){

//        String filePath = "d:\\_ForSO\\CsvTest\\CsvFile.txt";
        try {
//            List<Product> products = ParseProductCsv(filePath);
            BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/songs_normalize.csv"));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(DataSetEnum.class).withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord: csvParser) {

                // Accessing Values by Column Index
                String name = csvRecord.get(0);

                //Accessing the values by column header name
                String fees = csvRecord.get("key");

                //Printing the record
                System.out.println("Record Number - " + csvRecord.getRecordNumber());
                System.out.println("Name : " + name);
                System.out.println("Fees : " + fees);
                System.out.println("\n\n");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public DataSetEnum parseDataSet (String filePath) {
        return null;
    }

    public class Product {
        public String Name;
        public String PurchasePrice;
        public String Group;
        public String Amount;
        public String Composition;
        public String Count;
    }

//    //Расинг CSV файла по указанному пути и получение продуктов из него
//    private static List<Product> ParseProductCsv(String filePath) throws IOException {
//        //Загружаем строки из файла
//        List<Product> products = new ArrayList<Product>();
//        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
//        for (String fileLine : fileLines) {
//            String[] splitedText = fileLine.split(",");
//            ArrayList<String> columnList = new ArrayList<String>();
//            for (int i = 0; i < splitedText.length; i++) {
//                //Если колонка начинается на кавычки или заканчиваеться на кавычки
//                if (IsColumnPart(splitedText[i])) {
//                    String lastText = columnList.get(columnList.size() - 1);
//                    columnList.set(columnList.size() - 1, lastText + ","+ splitedText[i]);
//                } else {
//                    columnList.add(splitedText[i]);
//                }
//            }
//            Product product = new Product();
//            product.Name = columnList.get(0);
//            product.PurchasePrice = columnList.get(1);
//            product.Group = columnList.get(2);
//            product.Amount = columnList.get(3);
//            product.Composition = columnList.get(4);
//            product.Count = columnList.get(5);
//            products.add(product);
//        }
//        return products;
//    }

    //Проверка является ли колонка частью предыдущей колонки
    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();
        //Если в тексте одна ковычка и текст на нее заканчиваеться значит это часть предыдущей колонки
        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }

}
