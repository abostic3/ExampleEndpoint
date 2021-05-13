package com.luma.boston.service.repository;

import com.luma.boston.service.model.RabbitMessage;
import com.luma.boston.service.model.RequestForQuote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RabbitMessageRepository extends MongoRepository<RabbitMessage, String> {

}
