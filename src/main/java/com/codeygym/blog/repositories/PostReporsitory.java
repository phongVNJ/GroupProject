package com.codeygym.blog.repositories;

import com.codeygym.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostReporsitory extends JpaRepository<Post,Long> {



}
