package com.example.ifOnlyStock.controllers;

import com.example.ifOnlyStock.models.FxRate;
import com.example.ifOnlyStock.repositories.FxRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FxRateController {

    @Autowired
    FxRateRepository fxRateRepository;

    // INDEX
    @GetMapping(value="/fxrate")
    public ResponseEntity<List<FxRate>> getAllFxRate() {
        return new ResponseEntity<>(fxRateRepository.findAll(), HttpStatus.OK);
    }

    // SHOW
    @GetMapping(value = "/fxrate/{id}")
    public ResponseEntity getFxRate(@PathVariable Long id) {
        return new ResponseEntity<>(fxRateRepository.findById(id), HttpStatus.OK);
    }

    //    CREATE
    @PostMapping(value = "/fxrate")
    public ResponseEntity<FxRate> postFxRate(@RequestBody FxRate fxRate) {
        fxRateRepository.save(fxRate);
        return new ResponseEntity<>(fxRate, HttpStatus.CREATED);
    }

    //    UPDATE
    @PutMapping(value = "/fxrate/{id}")
    public ResponseEntity<FxRate> putIfOnlyStock(@RequestBody FxRate fxRate,
                                                      @PathVariable Long id){
        FxRate fxRateToUpdate = fxRateRepository.findById(id).get();
        fxRateToUpdate.setName(fxRate.getName());
        fxRateToUpdate.setToCurrency(fxRate.getToCurrency());
        fxRateToUpdate.setFromCurrency(fxRate.getFromCurrency());
        fxRateToUpdate.setRate(fxRate.getRate());
        return new ResponseEntity<>(fxRateToUpdate, HttpStatus.OK);
    }

    //    DELETE
    @DeleteMapping(value = "/fxrate/{id}")
    public ResponseEntity<Long> deleteFxRate(@PathVariable Long id) {
        fxRateRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
