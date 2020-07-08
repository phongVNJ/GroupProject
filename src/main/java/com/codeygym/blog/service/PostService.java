package com.codeygym.blog.service;

import com.codeygym.blog.entities.Post;
import com.codeygym.blog.repositories.PostReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    @Autowired
    private PostReporsitory postReporsitory;

    public List<Post> getAllPosts(){
        return postReporsitory.findAll();

    }

    public void insert(Post post) {
        postReporsitory.save(post);
    }
}
