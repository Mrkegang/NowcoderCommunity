package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kg
 * @version 1.0
 * @date 2022/4/28 22:30
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户id查询用户
     */
    User selectById(int id);

    /**
     * 根据用户名查询用户
     */
    User selectByName(String username);

    /**
     * 根据邮箱查询用户
     */
    User selectByEmail(String email);

    /**
     * 插入一个用户
     */
    int insertUser(User user);

    /**
     * 根据id更新用户状态
     */
    int updateStatus(int id, int status);

    /**
     * 根据id更新用户头像
     */
    int updateHeader(int id, String headerUrl);

    /**
     * 根据id更新用户密码
     */
    int updatePassword(int id, String password);
}
