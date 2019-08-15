package com.learn.service;

import com.learn.mapper.HrMapper;
import com.learn.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-05 22:01
 **/
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
