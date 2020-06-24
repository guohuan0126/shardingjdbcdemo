package com.irving.shardingjdbcjemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @program: shardingjdbcjemo
 * @description:
 * @author: Irving
 * @create: 2020-06-24
 **/
@Data
@TableName(value = "t_user") //指定对应表
public class User {
    private Long userId;
    private String username;
    private String ustatus;
}
