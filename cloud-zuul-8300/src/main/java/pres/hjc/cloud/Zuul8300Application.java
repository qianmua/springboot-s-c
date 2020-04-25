package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 18:54
 */
@SpringBootApplication
//代理
@EnableZuulProxy
public class Zuul8300Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul8300Application.class,args);
    }
}
