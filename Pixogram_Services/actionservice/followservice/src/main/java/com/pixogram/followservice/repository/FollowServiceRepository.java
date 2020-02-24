package com.pixogram.followservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.followservice.entity.Follow;
@Repository
public interface FollowServiceRepository extends JpaRepository<Follow, Integer> {

}
