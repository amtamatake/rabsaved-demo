package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.dao.User;

@Mapper
public interface UserMapper {
    User findUser(String account, String password);
}
