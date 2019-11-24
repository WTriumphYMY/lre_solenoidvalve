package cn.edu.nwpu.solenoidvalve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SolenoidvalveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolenoidvalveApplication.class, args);
    }

}
