package com.erykszczesniak.blog.exception;

public class PostNotFoundException extends RuntimeException {

    public PostNotFoundException(Long id) {
        super("Post not found with id" + id);

    }
}
