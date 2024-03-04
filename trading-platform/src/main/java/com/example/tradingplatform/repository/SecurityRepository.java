package com.example.tradingplatform.repository;
import com.example.tradingplatform.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecurityRepository  extends JpaRepository<Security, Long>{

    //List<Security> findByName(String name);

}
