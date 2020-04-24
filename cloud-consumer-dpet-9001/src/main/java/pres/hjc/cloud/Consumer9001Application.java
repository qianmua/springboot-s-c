package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 19:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients( basePackages = {"pres.hjc.cloud.service"})
public class Consumer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9001Application.class,args);
    }
}
