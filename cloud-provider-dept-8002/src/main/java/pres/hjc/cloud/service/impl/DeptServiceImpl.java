package pres.hjc.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.hjc.cloud.mapper.DeptMapping;
import pres.hjc.cloud.pojo.Dept;
import pres.hjc.cloud.service.DeptService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:28
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapping deptMapping;

    @Override
    public boolean add(Dept dept) {
        return deptMapping.add(dept);
    }

    @Override
    public Dept queryById(long id) {
        return deptMapping.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapping.queryAll();
    }
}
