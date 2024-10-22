/*
package io.camunda.connector;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "zeebe.client")
public class CamundaClientProperties {

  private String gatewayAddress;
  private Worker worker;

  // Getters and setters for all the properties
  public String getGatewayAddress() {
    return gatewayAddress;
  }

  public void setGatewayAddress(String gatewayAddress) {
    this.gatewayAddress = gatewayAddress;
  }

  public Worker getWorker() {
    return worker;
  }

  public void setWorker(Worker worker) {
    this.worker = worker;
  }

  // Inner class for worker-related properties
  public static class Worker {
    private String defaultName;
    private String defaultType;
    private int threads;

    public String getDefaultName() {
      return defaultName;
    }

    public void setDefaultName(String defaultName) {
      this.defaultName = defaultName;
    }

    public String getDefaultType() {
      return defaultType;
    }

    public void setDefaultType(String defaultType) {
      this.defaultType = defaultType;
    }

    public int getThreads() {
      return threads;
    }

    public void setThreads(int threads) {
      this.threads = threads;
    }
  }
}
*/
