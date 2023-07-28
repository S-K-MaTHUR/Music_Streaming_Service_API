package com.geekster.Music_Streaming_Service_API.service;

import com.geekster.Music_Streaming_Service_API.models.Admin;
import com.geekster.Music_Streaming_Service_API.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminService {

    @Autowired
    IAdminRepo iAdminRepo;

    public String addAdmin(Admin admin) {
        return null;
    }

    public List<Admin> getAllAdmins() {
        return null;
    }

    public String deleteByEmail(String email) {
        return email;
    }
}
