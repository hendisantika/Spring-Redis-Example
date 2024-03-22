package com.hendisantika.springredisexample.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-02
 * Time: 06:07
 * To change this template use File | Settings | File Templates.
 */

@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private int id;

    @NotNull
    @Size(min = 2, max = 30, message = "Name should contains more than 2 character")
    private String name;

    @NotNull(message = " * Age field missing")
    private int age;

    @NotNull
    @Email(message = "Invalid Email id")
    @Pattern(regexp = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b", message = "Invalid Email pattern")
    private String email;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
