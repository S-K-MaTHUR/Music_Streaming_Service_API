package com.geekster.Music_Streaming_Service_API.repo;

import com.geekster.Music_Streaming_Service_API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findByUserEmail(String userEmail);
}
