package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 18:01
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8002Application.class,args);
    }
}
