package pres.hjc.cloud.mapper;

import org.apache.ibatis.annotations.*;
import pres.hjc.cloud.pojo.Dept;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:22
 */
@Mapper
public interface DeptMapping {

    /**
     * add
     * @param dept
     * @return
     */
    @Insert("insert into t_dept(d_name, db_name) values (#{dName} ,#{dbName}  )")
    @Options( useGeneratedKeys = false , keyColumn = "dept_no" , keyProperty = "deptNo")
    boolean add(Dept dept);

    /**
     * queryAll
     * @return
     */
    @Select("select dept_no, d_name, db_name from t_dept")
    @Results(id = "queryDept" , value = {
        @Result( property = "deptNo" , column = "dept_no"),
        @Result( property = "dName" , column = "d_name"),
        @Result( property = "dbName" , column = "db_name"),
    })
    List<Dept> queryAll();

    /**
     * query By Id
     * @param id
     * @return
     */
    @Select("SELECT dept_no, d_name, db_name from t_dept where dept_no = #{id} ")
    @ResultMap(value = "queryDept")
    Dept queryById(@Param("id") long id);
}
