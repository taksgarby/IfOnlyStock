package com.example.ifOnlyStock.repositories;

import com.example.ifOnlyStock.models.IfOnlyStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IfOnlyStockRepository extends JpaRepository<IfOnlyStock, Long> {

}
