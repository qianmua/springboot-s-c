package pres.hjc.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:34
 */
/** 自动注册到eureka */
@SpringBootApplication
@EnableEurekaClient
public class Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class,args);
    }

    /**
     *  使他可以被检测到
     *  监控到地址 ->
     *  圆 -> 心跳
     *  绿 —> 成功
     *  蓝 -> 熔断
     *  青 -> 错误请求数
     *  橙 -> 超时
     *  紫 -> 线程池拒绝数
     *  红 -> 错误请求
     *  灰色百分比 -> 绿/红
     *  host -> 服务请求频率
     *  cluster ->
     *  circuit -> 路段状态
     *
     * @return
     */
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        bean.addUrlMappings("/actuator/hystrix.stream");
        return bean;
    }

}



