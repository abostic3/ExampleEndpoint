package com.luma.boston.service.service.impl;

import com.luma.boston.service.model.RabbitMessage;
import com.luma.boston.service.repository.RabbitMessageRepository;
import com.luma.boston.service.service.RabbitMessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RabbitMessageServiceImpl implements RabbitMessageService {

  private final RabbitMessageRepository repository;

  @Override
  public RabbitMessage save(Object requestForQuote) {
    RabbitMessage rabbitMessage = new RabbitMessage();
    rabbitMessage.setMessage(rabbitMessage);
    return repository.save(rabbitMessage);
  }
}
