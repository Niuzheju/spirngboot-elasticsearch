package com.niuzj.elasticsearch.dao;

import com.niuzj.elasticsearch.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author niuzj
 * @date 2019/4/17 14:48
 */
public interface UserRepository extends ElasticsearchRepository<User, Long> {

}
