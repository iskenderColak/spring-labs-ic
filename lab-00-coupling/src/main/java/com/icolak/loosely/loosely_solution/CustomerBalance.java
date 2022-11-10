package com.icolak.loosely.loosely_solution;

import java.math.BigDecimal;
import java.util.UUID;

public class CustomerBalance extends Balance{
    public CustomerBalance(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    @Override
    public BigDecimal addAmount(BigDecimal amount) {
        setAmount(this.getAmount().add(amount));
        return this.getAmount();
    }
}
