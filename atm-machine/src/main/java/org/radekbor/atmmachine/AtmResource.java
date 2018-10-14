package org.radekbor.atmmachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
public class AtmResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public BigDecimal getBalance(@PathVariable("id") String id) {
        return restTemplate.getForObject("http://Accounts/balance/" + id, BigDecimal.class);
    }
}
