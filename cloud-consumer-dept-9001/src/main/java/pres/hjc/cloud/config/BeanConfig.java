package pres.hjc.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 16:28
 */
@Configuration
public class BeanConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
