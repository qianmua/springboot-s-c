package pres.hjc.cloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/23
 * @time 15:03
 */
@Data
//@NoArgsConstructor
//链式编程
@Accessors( chain = true)
public class Dept implements Serializable {

    private long deptNo;
    private String dName;
    /**来自数据库？*/
    private String dbName;

    /*public Dept(String dName) {
        this.dName = dName;
    }*/
}
