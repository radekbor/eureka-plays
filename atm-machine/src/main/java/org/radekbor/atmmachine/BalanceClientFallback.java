package org.radekbor.atmmachine;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BalanceClientFallback implements BalanceClient {
    @Override
    public BigDecimal getBalance(String id) {
        return new BigDecimal("-1.00");
    }
}
