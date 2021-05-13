package com.luma.boston.service.service;

import com.luma.boston.service.model.RabbitMessage;

public interface RabbitMessageService {
    RabbitMessage save(Object requestForQuote);
}
