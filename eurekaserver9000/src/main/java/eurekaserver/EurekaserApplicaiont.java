package eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动eureka服务端
public class EurekaserApplicaiont {
    public static void main(String[] args) {
        SpringApplication.run(EurekaserApplicaiont.class,args);
    }
}
