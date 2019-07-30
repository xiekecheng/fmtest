package com.learn.dbsecurity.mapper;

import com.learn.dbsecurity.model.Role;
import com.learn.dbsecurity.model.User;

import java.util.List;

/**
 * @description:
 * @author: xiekecheng
 * @since: 2019-07-30 16:40
 **/
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);

}
