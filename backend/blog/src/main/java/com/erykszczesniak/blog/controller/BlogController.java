package com.erykszczesniak.blog.controller;


import com.erykszczesniak.blog.entity.Blog;
import com.erykszczesniak.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping
    public List<Blog> getAllPosts() {
        return blogService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable Long id) {
        return blogService.getById(id);
    }

    @PostMapping("/add")
    public Blog addPost(@RequestBody Blog blog) {
        return blogService.addPost(blog);
    }

    @PutMapping("/edit/{id}")
    public Blog editPost(@PathVariable Long id, @RequestBody Blog blog) {
        return blogService.editPost(id, blog);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        return blogService.deletePost(id);
    }

}
