package com.niuzj.elasticsearch.service;

import com.niuzj.elasticsearch.model.User;

import java.util.List;

/**
 * @author niuzj
 * @date 2019/4/17 14:50
 */
public interface UserService {

    /**
     * 插入文档
     */
    void insert(User user);

    /**
     * 按查询语句搜索
     */
    List<User> search(String content);

    /**
     * 分页查询
     */
    List<User> searchByPage(Integer page, Integer pageSize, String content);

    /**
     * 根据权重查询
     */
    List<User> searchByWeight(String content);

    /**
     * 根据用户id删除
     */
    void deleteUser(User user);




}
