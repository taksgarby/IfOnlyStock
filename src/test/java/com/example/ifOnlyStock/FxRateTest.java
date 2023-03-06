package com.example.ifOnlyStock;

import com.example.ifOnlyStock.models.FxRate;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class FxRateTest {

    FxRate fxRate;

    @Before
    public void before() {
        fxRate = new FxRate("USD-GBP", "USD", "GBP", new BigDecimal("0.82"));
    }

    @Test
    public void hasName() {
        assertEquals("USD-GBP", fxRate.getName());
    }

    @Test
    public void hasFromCurrency() {
        assertEquals("USD", fxRate.getFromCurrency());
    }

    @Test
    public void hasToCurrency() {
        assertEquals("GBP", fxRate.getToCurrency() );
    }

    @Test
    public void hasRate() {
        assertEquals(new BigDecimal("0.82"), fxRate.getRate());
    }

    @Test
    public void convertAmount() {
        assertEquals(new BigDecimal("8.20"), fxRate.convertAmount(new BigDecimal(10)));
    }


}
