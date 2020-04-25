package pres.hjc.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pres.hjc.cloud.pojo.Dept;
import pres.hjc.cloud.service.DeptService;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:30
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    /**
     * 服务熔断
     * @param id
     * @return
     */
    @HystrixCommand( fallbackMethod = "getHystrix")
    @GetMapping("/hystrix/get/{id}")
    public Dept getById(@PathVariable("id") long id){
        Dept dept = service.queryById(id);
        if (dept == null){{
            throw new RuntimeException("null");
        }}
        return dept;
    }

    public Dept getHystrix(@PathVariable("id")long id){
        return new Dept()
                .setDeptNo(id)
                .setDbName("this id is null");
    }
}
