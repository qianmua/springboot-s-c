package pres.hjc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pres.hjc.cloud.pojo.Dept;
import pres.hjc.cloud.service.impl.DeptServiceImpl;

import java.util.List;

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
    private DeptServiceImpl deptService;

    @GetMapping("/dept/add")
    public boolean add(Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept dept(@PathVariable("id")long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/queryAll")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
