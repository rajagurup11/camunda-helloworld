package io.camunda.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

  private static final Logger LOG = LoggerFactory.getLogger(HelloWorldApplication.class);
  @Autowired
//  private  CamundaClientProperties camundaClientProperties;

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

 /* @PostConstruct
  public void init() {
    System.out.println("Zeebe Gateway Address: " + camundaClientProperties.getGatewayAddress());
    System.out.println("Worker Default Name: " + camundaClientProperties.getWorker().getDefaultName());
    System.out.println("Worker Threads: " + camundaClientProperties.getWorker().getThreads());
  }*/
}



// https://docs.camunda.io/docs/guides/getting-started-java-spring/
// https://github.com/camunda-community-hub/spring-zeebe?tab=readme-ov-file
// https://github.com/camunda/camunda/releases
// https://github.com/camunda/camunda/issues/23183
//https://forum.camunda.io/t/making-rest-api-call-in-camunda-platform-8-self-managed/38583/7
//https://www.postman.com/camundateam/camunda-8-postman/request/
//https://docs.camunda.io/docs/1.3/self-managed/zeebe-deployment/local/quickstart/
//https://forum.camunda.io/t/making-rest-api-call-in-camunda-platform-8-self-managed/38583
//https://camunda.com/blog/2022/07/a-technical-sneak-peek-into-camundas-connector-architecture/
//https://github.com/camunda/connectors/blob/main/connector-runtime/README.md
//https://github.com/camunda-community-hub/spring-zeebe/issues/429
//https://github.com/camunda-community-hub/spring-zeebe/tree/8.0.11
//https://github.com/camunda-community-hub/camunda-8-connector-openweather-api
//https://github.com/camunda-community-hub/camunda-8-examples/tree/main