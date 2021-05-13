package com.luma.boston.service.controller;

import com.luma.boston.service.model.RabbitMessage;
import com.luma.boston.service.service.RfqService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RfqController {

  private final RfqService service;

  @PostMapping("/rfq")
  @PreAuthorize("#oauth2.hasScope('serverclient') or hasAuthority('Administrator')")
  public ResponseEntity getStatus(@RequestBody Object message){
    RabbitMessage message1 = new RabbitMessage();
    message1.setMessage(message);
    service.save(message1);
    return ResponseEntity.ok().build();
  }

}
