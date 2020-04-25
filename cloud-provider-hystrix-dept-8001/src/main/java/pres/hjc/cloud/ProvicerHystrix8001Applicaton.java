package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 16:55
 */
@SpringBootApplication
@EnableEurekaClient
//启动熔断机制(路断器)
@EnableCircuitBreaker
//@EnableDiscoveryClient // 服务发现
public class ProvicerHystrix8001Applicaton {

    public static void main(String[] args) {
        SpringApplication.run(ProvicerHystrix8001Applicaton.class,args);
    }
}
