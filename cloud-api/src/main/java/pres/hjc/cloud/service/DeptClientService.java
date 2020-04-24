package pres.hjc.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pres.hjc.cloud.pojo.Dept;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 19:14
 */
@Component
@FeignClient( value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {

    /**
     * get by id
     * @param id
     * @return
     */
    @GetMapping("feign/get/{id}")
    Dept queryById(@PathVariable("id") long id);

    /**
     * query all
     * @return
     */
    @GetMapping("feign/queryAll")
    List<Dept> queryAll();

    /**
     * add
     * @param dept
     * @return
     */
    @GetMapping("feign/add")
    boolean add(Dept dept);
}
