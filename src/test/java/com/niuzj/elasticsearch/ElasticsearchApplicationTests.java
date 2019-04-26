package com.niuzj.elasticsearch;

import com.niuzj.elasticsearch.model.User;
import com.niuzj.elasticsearch.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void search() {
        List<User> list = userService.search("niuzheju");
        System.out.println(list);
    }

    @Test
    public void searchByPage(){
        List<User> list = userService.searchByPage(1, 10, "20");
        System.out.println(list);
    }

}
