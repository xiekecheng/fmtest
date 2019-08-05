package com.example.model;

import com.example.group.ValidationGroup1;
import com.example.group.ValidationGroup2;
import lombok.Data;

import javax.validation.constraints.*;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-01 06:05
 **/
@Data
public class User {
    private Integer id;
    @Size(min=5,max=10,message = "{user.name.size}")
    private String name;
    @NotNull(message = "{user.address.notnull}",groups = ValidationGroup1.class)
    private String address;
    @DecimalMin(value = "1",message = "{user.age.size}")
    @DecimalMax(value = "1",message = "{user.age.size}")
    private Integer age;
    @Email(message = "{user.email.pattern}")
    @NotNull(message = "{user.email.notnull}",groups = ValidationGroup2.class)
    private String email;

}
