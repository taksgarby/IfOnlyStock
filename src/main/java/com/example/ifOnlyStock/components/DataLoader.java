package com.example.ifOnlyStock.components;

import com.example.ifOnlyStock.models.Country;
import com.example.ifOnlyStock.models.IfOnlyStock;
import com.example.ifOnlyStock.models.IndustryType;
import com.example.ifOnlyStock.repositories.IfOnlyStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner
{

    @Autowired
    IfOnlyStockRepository ifOnlyStockRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        IfOnlyStock apple = new IfOnlyStock(
                "Apple", 177.57, 37.07, LocalDate.of(2021, 12, 31),
                LocalDate.of(2019, 1, 4), "USD", Country.USA,
                IndustryType.TECHNOLOGY);
        ifOnlyStockRepository.save(apple);

        IfOnlyStock google = new IfOnlyStock("Google", 148.93, 49.56,
                LocalDate.of(2021, 11, 19),
                LocalDate.of(2018, 12, 21), "USD", Country.USA,
                IndustryType.TECHNOLOGY);
        ifOnlyStockRepository.save(google);

        IfOnlyStock rakuten = new IfOnlyStock
                ("Rakuten", 1488.00, 672.00, LocalDate.of(2021, 3, 19),
                LocalDate.of(2020, 3, 13), "JPY", Country.JAPAN,
                        IndustryType.RETAIL);
        ifOnlyStockRepository.save(rakuten);


    }


}
