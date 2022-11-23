package com.erykszczesniak.blog.service;


import com.erykszczesniak.blog.entity.Blog;
import com.erykszczesniak.blog.exception.PostNotFoundException;
import com.erykszczesniak.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> getAllPosts() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getById(Long id) {
        return blogRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

    @Override
    public Blog addPost(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog editPost(Long id, Blog blog) {
        Blog blogById = blogRepository.findById(id).get();
        blogById.setTitle(blog.getTitle());
        blogById.setDetails(blog.getDetails());
        blogById.setCategory(blog.getCategory());
        blogById.setCreatedAt(blog.getCreatedAt());
        blogById.setFeaturedImageUrl(blog.getFeaturedImageUrl());
        return blogRepository.save(blogById);
    }

    @Override
    public String deletePost(Long id) {
        boolean exists = blogRepository.existsById(id);
        if (exists) {
            blogRepository.deleteById(id);
            return "Post was deleted with id " + " " + id;
        }
        return "Post does not exist";
    }
}
