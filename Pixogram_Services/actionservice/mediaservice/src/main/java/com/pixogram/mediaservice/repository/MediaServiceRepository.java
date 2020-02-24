package com.pixogram.mediaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.mediaservice.entity.Media;

@Repository
public interface MediaServiceRepository extends JpaRepository<Media, Integer> {

}
