package com.study.delete;

import com.study.delete.domain.Money;
import com.study.delete.service.MoneyService;
import com.study.delete.service.impl.MoneyServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

@SpringBootTest
@MapperScan("com.study.delete.mapper")
class DeleteDataApplicationTests {

    @Autowired
    private MoneyService moneyService;

    @Test
    void contextLoads() {
        boolean save = moneyService.save(Money.builder()
                .count(new BigDecimal(11.1))
                .build());
        System.out.println(save);
    }

    @Test
    void Test02(){
    }

}
