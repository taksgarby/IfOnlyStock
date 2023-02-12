package com.example.ifOnlyStock.controllers;

import com.example.ifOnlyStock.models.IfOnlyStock;
import com.example.ifOnlyStock.repositories.IfOnlyStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class IfOnlyStockController {

    @Autowired
    IfOnlyStockRepository ifOnlyStockRepository;

//    INDEX
    @GetMapping(value = "/stocks")
    public ResponseEntity<List<IfOnlyStock>> getAllStocks() {
        return new ResponseEntity<>(ifOnlyStockRepository.findAll(), HttpStatus.OK);
    }

//    SHOW
    


}
