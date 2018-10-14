package org.radekbor.atmmachine;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(value = "accounts", fallback = BalanceClientFallback.class)
public interface BalanceClient {

    @GetMapping("/balance/{id}")
    BigDecimal getBalance(@PathVariable("id") String id);

}
