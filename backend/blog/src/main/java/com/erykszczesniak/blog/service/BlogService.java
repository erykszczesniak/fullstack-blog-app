package com.erykszczesniak.blog.service;

import com.erykszczesniak.blog.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> getAllPosts();

    Blog getById(Long id);

    Blog addPost(Blog blog);

    Blog editPost(Long id, Blog blog);

    String deletePost(Long id);


}
