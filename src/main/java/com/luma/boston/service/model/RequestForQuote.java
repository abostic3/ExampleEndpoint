package com.luma.boston.service.model;

import com.luma.api.product.model.ProductRequest.SolveForEnum;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Accessors(chain = true)
@Document(collection = "Rfq")
public class RequestForQuote {
  private String id;
  private String requestId;
  private SolveForEnum solveFor;
  private String productId;
  private String product;
  private List<Object> quoteProviders;
  private String parameters;
  private String bidDeadlineTimestamp;
  private String status;
  private String requestType;
  private Double notional;
  private String createDateTimestamp;
  private String client;
  private String creationHubQuoteId;
  private String createdByUsername;
  private String productCreationType;
  private Integer version;

}
