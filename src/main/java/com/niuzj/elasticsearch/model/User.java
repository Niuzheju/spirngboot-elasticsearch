package com.niuzj.elasticsearch.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author niuzj
 * @date 2019/4/17 14:41
 */
@Data
@NoArgsConstructor
@ToString
@Document(indexName = "localhost", type = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -5243934765171271542L;

    private Long id;

    private String name;

    private Integer age;

    private String sex;

    private String phone;

    private String desc;

    private LocalDateTime createTime;

    public User(Long id, String name, Integer age, String sex, String phone, String desc, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.desc = desc;
        this.createTime = createTime;
    }


}
