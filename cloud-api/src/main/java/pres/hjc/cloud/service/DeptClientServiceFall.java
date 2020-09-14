package pres.hjc.cloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import pres.hjc.cloud.pojo.Dept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 17:40
 */
//服务降级
@Component
public class DeptClientServiceFall implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(long id) {
                return new Dept()
                        .setDeptNo(id)
                        .setDName("来自服务降级 -> ");
            }

            @Override
            public List<Dept> queryAll() {
                return new ArrayList<>();
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }

}
