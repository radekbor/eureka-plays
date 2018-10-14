package org.radekbor.accounts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;
import java.util.Random;

@RestController
public class AccountsResource {

    private static final Logger log = LoggerFactory.getLogger(AccountsResource.class);

    private static final Random random = new Random();

    @GetMapping("/balance/{id}")
    public BigDecimal getBalance(@PathVariable("id") String id) throws InterruptedException {

        int timeout = random.nextInt(20) * 100;
        log.info("going to sleep for {}", timeout);
        Thread.sleep(timeout);
        log.info("after sleep");

        return new BigDecimal("102.11");
    }
}
