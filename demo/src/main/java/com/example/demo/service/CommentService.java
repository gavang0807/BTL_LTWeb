package com.example.demo.service;

import com.example.demo.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
