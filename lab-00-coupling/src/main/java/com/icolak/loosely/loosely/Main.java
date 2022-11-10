package com.icolak.loosely.loosely;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        UUID user = UUID.randomUUID();

        Balance customerBalance = new CustomerBalance(user, BigDecimal.ZERO);
        Balance giftCardBalance = new GiftCardBalance(user, BigDecimal.ZERO);

        customerBalance.addAmount(new BigDecimal(150));
        giftCardBalance.addAmount(new BigDecimal(120));

        BalanceManager balanceManager =
                new BalanceManager();

        System.out.println(balanceManager.checkout(giftCardBalance, BigDecimal.valueOf(100)));

    }
}
