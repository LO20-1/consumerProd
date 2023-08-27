package com.service.ConsumerProd.controller;

import com.service.ConsumerProd.model.Consumer;
import com.service.ConsumerProd.repository.ConsumerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    private final ConsumerRepository consumerRepository;

    public ConsumerController(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @GetMapping
    public List<Consumer> getAllConsumers() {
        return consumerRepository.getAllConsumers();
    }

    @PostMapping
    public Boolean createConsumer(@RequestBody Consumer consumer) {
        return consumerRepository.save(consumer);
    }

}
