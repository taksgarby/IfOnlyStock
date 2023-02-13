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
                "Apple", 177.57, 37.07, 154.50, LocalDate.of(2021, 12, 31),
                LocalDate.of(2019, 1, 4), LocalDate.of(2023, 2, 13), "USD", Country.USA,
                IndustryType.TECHNOLOGY);
        ifOnlyStockRepository.save(apple);

        IfOnlyStock google = new IfOnlyStock("Google", 148.93, 49.56, 94.57,
                LocalDate.of(2021, 11, 19),
                LocalDate.of(2018, 12, 21), LocalDate.of(2023, 2, 13),
                "USD", Country.USA, IndustryType.TECHNOLOGY);
        ifOnlyStockRepository.save(google);

        IfOnlyStock rakuten = new IfOnlyStock
                ("Rakuten", 1488.00, 672.00, 672.00, LocalDate.of(2021, 3, 19),
                LocalDate.of(2020, 3, 13), LocalDate.of(2023, 2, 13),
                        "JPY", Country.JAPAN, IndustryType.RETAIL);
        ifOnlyStockRepository.save(rakuten);

        IfOnlyStock unilever = new IfOnlyStock
                ("Unilever", 5196.00, 3801.50, 4198.00, LocalDate.of(2021, 3, 19),
                        LocalDate.of(2020, 3, 13), LocalDate.of(2023, 2, 13),
                "GBP", Country.UK, IndustryType.RETAIL);
        ifOnlyStockRepository.save(unilever);

        IfOnlyStock meta = new IfOnlyStock
                ("Meta", 376.26, 124.95, 174.15, LocalDate.of(2021, 9, 3),
                        LocalDate.of(2018, 12, 21), LocalDate.of(2023, 2, 13),
                        "USD", Country.USA, IndustryType.TECHNOLOGY);
        ifOnlyStockRepository.save(meta);

        IfOnlyStock morganStanley = new IfOnlyStock
                ("Morgan Stanley", 104.87, 30.32, 98.12, LocalDate.of(2022, 2, 11),
                        LocalDate.of(2020, 3, 20), LocalDate.of(2023, 2, 13),
                        "USD", Country.USA, IndustryType.FINANCE);
        ifOnlyStockRepository.save(morganStanley);


    }


}
