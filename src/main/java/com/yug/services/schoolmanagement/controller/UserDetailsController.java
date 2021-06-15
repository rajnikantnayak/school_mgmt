package com.yug.services.schoolmanagement.controller;

import com.yug.services.schoolmanagement.entity.UserEntity;
import com.yug.services.schoolmanagement.model.UserDetail;
import com.yug.services.schoolmanagement.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserDetailsController {

    @Autowired
    private UserRepo userRepo;

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/{userName}")
    public UserDetail getUserDetail(@PathVariable String userName){
        UserEntity userEntity = userRepo.findByUsername(userName).get();
        return new UserDetail(userEntity.getUsername(), userEntity.getEmail());
    }
}
