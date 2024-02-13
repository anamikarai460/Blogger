package com.blog.service;

import com.blog.payload.PostDto;

import java.util.List;

public interface PostService {

//    public void createPost(PostDto postDto);

    public PostDto createPost(PostDto postDto);

    void deletePost(long id);

//    List<PostDto> getAllPosts(int pageNo, int pagesize, String sortBy);

    List<PostDto> getAllPosts(int pageNo, int pagesize, String sortBy, String sortDir);

    PostDto updatePost(long postId, PostDto postDto);
}
