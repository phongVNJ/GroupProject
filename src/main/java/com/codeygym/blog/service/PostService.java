package com.codeygym.blog.service;

import com.codeygym.blog.entities.Post;
import com.codeygym.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();

    }

    public void insert(Post post) {
        postRepository.save(post);
    }
}
