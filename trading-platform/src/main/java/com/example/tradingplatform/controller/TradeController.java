package com.example.tradingplatform.controller;

import com.example.tradingplatform.model.Trade;
import com.example.tradingplatform.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class TradeController {

    @Autowired
    TradeRepository tradeRepository;

    @GetMapping("/trades")
    public ResponseEntity<List<Trade>> getAllTrades(){
        return new ResponseEntity<>(tradeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/trades/{id}")
    public ResponseEntity<?> getTradeById(@PathVariable("id") long id){
        return new ResponseEntity<>(tradeRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping("/trades/sell/{id}")
    public ResponseEntity<List<Trade>> getTradesBySellOrderId(@PathVariable("id") long id){
        return new ResponseEntity<>(tradeRepository.findBySellOrderId(id), HttpStatus.OK);
    }

    @GetMapping("/trades/buy/{id}")
    public ResponseEntity<List<Trade>> getTradesByBuyOrderId(@PathVariable("id") long id){
        return new ResponseEntity<>(tradeRepository.findByBuyOrderId(id), HttpStatus.OK);
    }

    @PostMapping("/trades")
    public ResponseEntity<Trade> createTrade(@RequestBody Trade trade) {
        return new ResponseEntity<>(tradeRepository.save(trade), HttpStatus.OK);
    }

}
