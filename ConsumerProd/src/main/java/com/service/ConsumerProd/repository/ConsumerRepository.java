package com.service.ConsumerProd.repository;

import com.service.ConsumerProd.converter.ConsumerConverter;
import com.service.ConsumerProd.dao.ConsumerDAO;
import com.service.ConsumerProd.entity.ConsumerEntity;
import com.service.ConsumerProd.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConsumerRepository {
    private final ConsumerDAO consumerDAO;

    @Autowired
    public ConsumerRepository(ConsumerDAO consumerDAO) {
        this.consumerDAO = consumerDAO;
    }

    public List<Consumer> getAllConsumers() {
        List<ConsumerEntity> consumerList = consumerDAO.getAllConsumers();
        List<Consumer> result = new ArrayList<>();

        for (ConsumerEntity consumer : consumerList){
            result.add(ConsumerConverter.convertToModel(consumer));
        }

        return result;
    }

    public Boolean save(Consumer consumer) {
        ConsumerEntity entity = ConsumerConverter.convertToEntity(consumer);
        return consumerDAO.save(entity);
    }
}
