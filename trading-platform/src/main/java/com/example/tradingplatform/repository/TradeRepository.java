package com.example.tradingplatform.repository;
import com.example.tradingplatform.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRepository  extends JpaRepository<Trade, Long>{

    List<Trade> findBySellOrderId(long sellOrderId);
    List<Trade> findByBuyOrderId(long buyOrderId);

}