package com.example.ifOnlyStock.controllers;

import com.example.ifOnlyStock.models.IfOnlyStock;
import com.example.ifOnlyStock.repositories.IfOnlyStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class IfOnlyStockController {

    @Autowired
    IfOnlyStockRepository ifOnlyStockRepository;

//    INDEX
    @GetMapping(value = "/ifonlystocks")
    public ResponseEntity<List<IfOnlyStock>> getAllIfOnlyStocks() {
        return new ResponseEntity<>(ifOnlyStockRepository.findAll(), HttpStatus.OK);
    }

//    SHOW

    @GetMapping(value = "/ifonlystocks/{id}")
    public ResponseEntity getIfOnlyStock(@PathVariable Long id) {
        return new ResponseEntity<>(ifOnlyStockRepository.findById(id), HttpStatus.OK);
    }

//    CREATE

    @PostMapping(value = "/ifonlystocks")
    public ResponseEntity<IfOnlyStock> postIfOnlyStock(@RequestBody IfOnlyStock ifOnlyStock) {
        ifOnlyStockRepository.save(ifOnlyStock);
        return new ResponseEntity<>(ifOnlyStock, HttpStatus.CREATED);
    }

//    UPDATE

    @PutMapping(value = "/ifonlystocks/{id}")
    public ResponseEntity<IfOnlyStock> putIfOnlyStock(@RequestBody IfOnlyStock ifOnlyStock,
                                                      @PathVariable Long id){
        IfOnlyStock ifOnlyStockToUpdate = ifOnlyStockRepository.findById(id).get();
        ifOnlyStockToUpdate.setCompanyName(ifOnlyStock.getCompanyName());
        ifOnlyStockToUpdate.setMaxPrice(ifOnlyStock.getMaxPrice());
        ifOnlyStockToUpdate.setMinPrice(ifOnlyStock.getMinPrice());
        ifOnlyStockToUpdate.setMaxPriceDate(ifOnlyStock.getMaxPriceDate());
        ifOnlyStockToUpdate.setMinPriceDate(ifOnlyStock.getMinPriceDate());
        ifOnlyStockToUpdate.setCurrency(ifOnlyStock.getCurrency());
        ifOnlyStockToUpdate.setCountry(ifOnlyStock.getCountry());
        ifOnlyStockToUpdate.setIndustryType(ifOnlyStock.getIndustryType());
        return new ResponseEntity<>(ifOnlyStockToUpdate, HttpStatus.OK);
    }

//    DELETE

    @DeleteMapping(value = "/ifonlystocks/{id}")
    public ResponseEntity<Long> deleteIfOnlyStock(@PathVariable Long id) {
        ifOnlyStockRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
