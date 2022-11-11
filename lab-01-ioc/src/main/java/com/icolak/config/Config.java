package com.icolak.config;

import com.icolak.Currency;
import com.icolak.account.Current;
import com.icolak.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;
@Configuration
public class Config {

    @Bean
    Current current() {
        Current current = new Current();
        current.setAccountId(UUID.randomUUID());
        current.setAmount(new BigDecimal(750));
        current.setCurrency(new Currency("DLR", "Dollar"));
        return current;
    }

    @Bean Currency currency() {
        return new Currency("DLR", "Dollar");
    }

    @Bean
    Saving saving(Currency currency) {
        Saving saving = new Saving();
        saving.setAccountId(UUID.randomUUID());
        saving.setAmount(new BigDecimal(500));
        saving.setCurrency(currency);
        return saving;
    }
}
