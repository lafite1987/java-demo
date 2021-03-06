package com.ejyi.demo.springboot.grpc.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebGrpcClientApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(WebGrpcClientApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return configureApplication(builder);
    }


    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder.sources(WebGrpcClientApplication.class).bannerMode(Banner.Mode.CONSOLE).registerShutdownHook(true).web(true);
    }

    public static void main(String[] args) {

        logger.info("Application start....");
        // http://127.0.0.1:8081/swagger-ui.html
        configureApplication(new SpringApplicationBuilder()).run(args);
        logger.info("Application end....");

    }
}
