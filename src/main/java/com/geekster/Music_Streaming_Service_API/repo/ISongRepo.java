package com.geekster.Music_Streaming_Service_API.repo;

import com.geekster.Music_Streaming_Service_API.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISongRepo extends JpaRepository<Song,Long> {

    List<Song> findAllBySongId(List<Long> songIds);
    Song findFirstBySongId(Long songId);
}
