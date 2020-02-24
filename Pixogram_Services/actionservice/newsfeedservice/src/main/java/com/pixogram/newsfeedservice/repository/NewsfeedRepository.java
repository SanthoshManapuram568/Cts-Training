package com.pixogram.newsfeedservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.newsfeedservice.entity.NewsFeed;

@Repository
public interface NewsfeedRepository extends JpaRepository<NewsFeed,Integer>{

}
