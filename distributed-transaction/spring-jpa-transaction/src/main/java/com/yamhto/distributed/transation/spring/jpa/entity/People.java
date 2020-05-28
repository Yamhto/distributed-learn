package com.yamhto.distributed.transation.spring.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author yamhto
 * @className: People.java
 * @package com.yamhto.distributed.transation.spring.jpa.entity
 * @description:
 * @date 2020/5/28 10:44
 */
@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String username;

    private String password;
    private String age;
    private String higher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHigher() {
        return higher;
    }

    public void setHigher(String higher) {
        this.higher = higher;
    }
}
