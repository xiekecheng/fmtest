package com.learn.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-31 21:32
 **/
@Data
@ApiModel(value = "用户实体类",description = "用户信息描述类")
public class User {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户地址")
    private String address;


}
