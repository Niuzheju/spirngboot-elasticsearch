package com.niuzj.elasticsearch.service.impl;

import com.niuzj.elasticsearch.dao.UserRepository;
import com.niuzj.elasticsearch.model.User;
import com.niuzj.elasticsearch.service.UserService;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niuzj
 * @date 2019/4/17 14:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insert(User user) {
        if (user != null && user.getId() != null){
            userRepository.save(user);
        }

    }

    @Override
    public List<User> search(String content) {
        QueryStringQueryBuilder queryStringQueryBuilder = new QueryStringQueryBuilder(content);
        Iterable<User> iterable = userRepository.search(queryStringQueryBuilder);
        List<User> list = new ArrayList<>();
        for (User anIterable : iterable) {
            list.add(anIterable);
        }
        return list;
    }

    @Override
    public List<User> searchByPage(Integer page, Integer pageSize, String content) {
        Page<User> search = userRepository.search(new QueryStringQueryBuilder(content), new PageRequest(page, pageSize));
        return search.getContent();
    }

    @Override
    public List<User> searchByWeight(String content) {
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(new QueryStringQueryBuilder(content));
        Iterable<User> iterable = userRepository.search(functionScoreQueryBuilder);
        List<User> list = new ArrayList<>();
        for (User anIterable : iterable) {
            list.add(anIterable);
        }
        return list;
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
