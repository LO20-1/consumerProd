package com.service.ConsumerProd;

import com.service.ConsumerProd.controller.ConsumerController;
import com.service.ConsumerProd.model.Consumer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ConsumerClient {

    @Autowired
    private ConsumerController consumerController;

    @PostConstruct
    public void run() {
        List<Consumer> consumerList = consumerController.getAllConsumers();
    }
}