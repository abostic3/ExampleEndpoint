package com.luma.boston.service.service.impl;

import com.luma.boston.service.model.RabbitMessage;
import com.luma.boston.service.model.RequestForQuote;
import com.luma.boston.service.repository.RfqRepository;
import com.luma.boston.service.service.RfqService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RfqServiceImpl implements RfqService {

  private final RfqRepository repository;

  @Override
  public RabbitMessage save(Object requestForQuote) {
    RabbitMessage rabbitMessage = new RabbitMessage();
    rabbitMessage.setMessage(rabbitMessage);
    return repository.save(rabbitMessage);
  }
}
