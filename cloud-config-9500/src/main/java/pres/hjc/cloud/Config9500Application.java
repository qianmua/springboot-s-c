package pres.hjc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/29
 * @time 11:09
 */
@SpringBootApplication
// 开启配置服务
@EnableConfigServer
public class Config9500Application {


    public static void main(String[] args) {
        SpringApplication.run(Config9500Application.class,args);
    }

}
