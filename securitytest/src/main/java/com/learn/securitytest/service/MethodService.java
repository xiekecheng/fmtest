package com.learn.securitytest.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 15:26
 **/
@Service
public class MethodService {
    @Secured("ROLE_ADMIN")
    public String admin(){
        return "hello admin";
    }

    @PreAuthorize("hasRole('ADMIN') and hasRole('DBA')")
    public String dba(){
        return "hello dba";
    }
    @PreAuthorize("hasAnyRole('ADMIN','USER','DBA')")
    public String user(){
        return "user";
    }
}
