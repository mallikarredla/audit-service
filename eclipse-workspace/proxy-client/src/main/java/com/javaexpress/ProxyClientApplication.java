package com.javaexpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProxyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyClientApplication.class, args);
    }

    @Bean(name="proxyCapability")
      public MicrometerCapability capability(MeterRegistry registry) {
        return new MicrometerCapability(registry);
    }
}


