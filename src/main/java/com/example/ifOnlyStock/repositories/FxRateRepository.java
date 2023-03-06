package com.example.ifOnlyStock.repositories;

import com.example.ifOnlyStock.models.FxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FxRateRepository extends JpaRepository<FxRate, Long> {

    List<FxRate> findByName(String name);

    List<FxRate> findByToCurrency(String toCurrency);

    List<FxRate> findByFromCurrency(String fromCurrency);

    List<FxRate> findByRate(String rate);

}
