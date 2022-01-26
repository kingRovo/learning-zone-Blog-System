package com.rovo.learningzone.repository;

import com.rovo.learningzone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
