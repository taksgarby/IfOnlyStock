package com.example.ifOnlyStock;

import com.example.ifOnlyStock.models.Country;
import com.example.ifOnlyStock.models.IfOnlyStock;
import com.example.ifOnlyStock.models.IndustryType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class IfOnlyStockTest {

    IfOnlyStock ifOnlyStock;

    @Before
    public void before(){
        ifOnlyStock = new IfOnlyStock("Apple", 3.56, 1.05, LocalDate.of(2023, 1, 20),
                LocalDate.of(2008, 6, 15), "USD", Country.USA, IndustryType.TECHNOLOGY);
    }

    @Test
    public void hasMaxPrice(){
        assertEquals(3.56, ifOnlyStock.getMaxPrice(), 0);
    }

    @Test
    public void hasIndustryType(){
        assertEquals(IndustryType.TECHNOLOGY, ifOnlyStock.getIndustryType());
    }



}
