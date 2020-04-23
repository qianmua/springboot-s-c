package pres.hjc.cloud.service;

import org.apache.ibatis.annotations.Param;
import pres.hjc.cloud.pojo.Dept;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:27
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept queryById(@Param("id") long id);
    List<Dept> queryAll( );
}
