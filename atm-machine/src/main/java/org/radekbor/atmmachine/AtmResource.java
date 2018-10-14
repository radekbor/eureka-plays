package org.radekbor.atmmachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AtmResource {

    @Autowired
    private BalanceClient balanceClient;

    @GetMapping("/{id}")
    public BigDecimal getBalance(@PathVariable("id") String id) {
        return balanceClient.getBalance(id);
    }
}
