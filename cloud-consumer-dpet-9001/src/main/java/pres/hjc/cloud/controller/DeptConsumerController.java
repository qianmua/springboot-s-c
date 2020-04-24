package pres.hjc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pres.hjc.cloud.pojo.Dept;
import pres.hjc.cloud.service.DeptClientService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 19:12
 */
@RestController
public class DeptConsumerController {

    /**
     * 提供边界访问远程服务的方法，简单的restful风格模板
     */
    /*@Autowired
    private RestTemplate restTemplate;*/

    //ribbon挂载了负载均衡 通过服务名来访问
    //private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

//    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private DeptClientService clientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
//        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
        return this.clientService.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept dept(@PathVariable("id") long id){
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id,Dept.class);
        return this.clientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/all")
    public List<Dept> queryAll(){
//        return restTemplate.getForObject(REST_UR/L_PREFIX + "/dept/queryAll" , List.class);
        return this.clientService.queryAll();
    }
}
