package cn.edu.hebuee.dao;

import cn.edu.hebuee.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
