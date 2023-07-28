package com.geekster.Music_Streaming_Service_API.repo;

import com.geekster.Music_Streaming_Service_API.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Long> {

    Admin findByAdminEmail(String userAdminEmail);
}
