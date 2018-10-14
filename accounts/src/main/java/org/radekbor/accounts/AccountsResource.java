package org.radekbor.accounts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;

@RestController
public class AccountsResource {

    @GetMapping("/balance/{id}")
    public BigDecimal getBalance(@PathVariable("id") String id) {
        return new BigDecimal("102.11");
    }
}
