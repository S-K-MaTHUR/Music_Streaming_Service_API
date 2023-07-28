package com.geekster.Music_Streaming_Service_API.controller;

import com.geekster.Music_Streaming_Service_API.models.Admin;
import com.geekster.Music_Streaming_Service_API.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public String addAdmin(@RequestBody @Valid Admin admin){
        return adminService.addAdmin(admin);
    }
    @GetMapping("/fetchList")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }
    @DeleteMapping("/remove/{email}")
    public String deleteByEmail(@PathVariable String email){
        return adminService.deleteByEmail(email);
    }


}
