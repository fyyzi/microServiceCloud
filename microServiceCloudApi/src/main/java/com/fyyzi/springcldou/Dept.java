package com.fyyzi.springcldou;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 类表关系映射
 *
 * @author 羽化荼
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 来自那个数据库,因为为服务架构可以一个服务对应一个数据库,同时一个信息被存储到不同数据库
     */
    private String db_source;

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDb_source("");
    }
}
