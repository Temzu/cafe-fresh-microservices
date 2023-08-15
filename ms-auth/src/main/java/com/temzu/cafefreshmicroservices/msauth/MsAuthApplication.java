package com.temzu.cafefreshmicroservices.msauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients(basePackages = "com.temzu.cafefreshmicroservices")
@SpringBootApplication(scanBasePackages = "com.temzu.cafefreshmicroservices")
@EnableJpaRepositories("com.temzu.cafefreshmicroservices")
@ComponentScan({"com.temzu.cafefreshmicroservices"})
@EntityScan("com.temzu.cafefreshmicroservices")
public class MsAuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsAuthApplication.class, args);
  }

}
