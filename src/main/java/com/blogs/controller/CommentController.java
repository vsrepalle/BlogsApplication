package com.blogs.controller;

import com.blogs.entity.Comment;
import com.blogs.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;
    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @GetMapping("/blog/{blogId}")
    public ResponseEntity<List<Comment>> getCommentsByBlog(@PathVariable Long blogId){
        return ResponseEntity.ok(commentService.getCommentsByBlog(blogId));
    }

}
