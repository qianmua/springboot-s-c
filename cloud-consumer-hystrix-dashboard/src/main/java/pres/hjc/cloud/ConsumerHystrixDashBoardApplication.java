package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 18:02
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启服务监控
public class ConsumerHystrixDashBoardApplication {

    /**
     * 找到服务
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashBoardApplication.class,args);
    }
}
