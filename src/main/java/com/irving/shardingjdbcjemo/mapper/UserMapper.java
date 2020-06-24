package com.irving.shardingjdbcjemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.irving.shardingjdbcjemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
