package eureka.back.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBackServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBackServerApplication.class, args);
    }

}
