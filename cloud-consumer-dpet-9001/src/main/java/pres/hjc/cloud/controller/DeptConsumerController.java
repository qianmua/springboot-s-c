package pres.hjc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pres.hjc.cloud.pojo.Dept;
import pres.hjc.cloud.service.DeptClientService;

import javax.annotation.Resource;
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
     * 指示器
     */
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept dept(@PathVariable("id") long id){
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/all")
    public List<Dept> queryAll(){
        return this.deptClientService.queryAll();
    }
}
