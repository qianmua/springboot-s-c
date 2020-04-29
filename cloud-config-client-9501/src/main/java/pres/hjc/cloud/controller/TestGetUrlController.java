package pres.hjc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/29
 * @time 14:25
 */
@RestController
public class TestGetUrlController {

    @Value("${spring.application.name}")
    private String  applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaService;
    @Value("${spring.port}")
    private String port;

    @GetMapping("/config")
    public String get(){

        int i = 90;

        String str = i >= 90 ? "A": i >= 80 ? "B": i >= 70 ? "C": "D";
        System.out.println(str);

        return applicationName + "====="
                + eurekaService + "====="
                + port;
    }
}
