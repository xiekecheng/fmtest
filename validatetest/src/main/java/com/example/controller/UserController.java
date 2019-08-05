package com.example.controller;

import com.example.group.ValidationGroup1;
import com.example.group.ValidationGroup2;
import com.example.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-01 06:12
 **/
@RestController
public class UserController {
    // @PostMapping(value = "/user")
    @PostMapping(value = "/user",produces = "text/json;charset=UTF-8")
    public List<String> user(@Validated(ValidationGroup2.class) User user, BindingResult result){
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }

    @GetMapping(value = "/user")
    public List<String> users(@Validated(ValidationGroup1.class) User user, BindingResult result){
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }
}
