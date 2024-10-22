package io.camunda.connector;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.HttpRequestFactory;
import io.camunda.connector.api.annotation.OutboundConnector;
import io.camunda.connector.api.json.ConnectorsObjectMapperSupplier;
import io.camunda.connector.api.outbound.OutboundConnectorContext;
import io.camunda.connector.api.outbound.OutboundConnectorFunction;
import io.camunda.connector.generator.java.annotation.ElementTemplate;
import io.camunda.connector.generator.java.annotation.ElementTemplate.PropertyGroup;
import io.camunda.connector.http.base.components.HttpTransportComponentSupplier;
import io.camunda.connector.http.base.services.HttpService;
import io.camunda.connector.http.rest.model.HttpJsonRequest;
import java.io.IOException;
import org.springframework.stereotype.Component;

@Component
@OutboundConnector(
    name = "HTTP REST",
    inputVariables = {
      "url",
      "method",
      "authentication",
      "headers",
      "queryParameters",
      "connectionTimeoutInSeconds",
      "readTimeoutInSeconds",
      "writeTimeoutInSeconds",
      "body"
    },
    type = HttpJsonFunction.TYPE)
@ElementTemplate(
    id = "io.camunda.connectors.HttpJson.v2",
    name = "REST Outbound Connector",
    description = "Invoke REST API",
    inputDataClass = HttpJsonRequest.class,
    version = 8,
    propertyGroups = {
      @PropertyGroup(id = "authentication", label = "Authentication"),
      @PropertyGroup(id = "endpoint", label = "HTTP endpoint"),
      @PropertyGroup(id = "timeout", label = "Connection timeout"),
      @PropertyGroup(id = "payload", label = "Payload")
    },
    documentationRef = "https://docs.camunda.io/docs/components/connectors/protocol/rest/",
    icon = "icon.svg")

public class HttpJsonFunction implements OutboundConnectorFunction {

  public static final String TYPE = "io.camunda:http-json:1";

  private final HttpService httpService;

  public HttpJsonFunction() {
    this(
        ConnectorsObjectMapperSupplier.getCopy(),
        HttpTransportComponentSupplier.httpRequestFactoryInstance());
  }

  public HttpJsonFunction(
      final ObjectMapper objectMapper, final HttpRequestFactory requestFactory) {
    this.httpService = new HttpService(objectMapper, requestFactory);
  }

  @Override
  public Object execute(final OutboundConnectorContext context)
      throws IOException, InstantiationException, IllegalAccessException {
    final var request = context.bindVariables(HttpJsonRequest.class);
    return httpService.executeConnectorRequest(request);
  }
}
