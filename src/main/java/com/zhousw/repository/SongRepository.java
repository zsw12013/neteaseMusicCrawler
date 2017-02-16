package com.zhousw.repository;

 import com.zhousw.model.Song;
 import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, String> {
    
    List<Song> findByCommentCountGreaterThan(Long commentCount);
    
}
