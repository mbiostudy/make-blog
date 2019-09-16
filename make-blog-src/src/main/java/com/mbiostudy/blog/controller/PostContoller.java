package com.mbiostudy.blog.controller;


import com.mbiostudy.blog.repository.PostDao;
import com.mbiostudy.blog.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;


@RestController
public class PostContoller {

    @Autowired
    PostDao postDao;

    @RequestMapping("/")
    public String index() {
        return "helloworld!";
    }


    @RequestMapping("/insert")
    public Post insertPost(Post post){

        Post postData = postDao.save(post);

        return postData;
    }

    @RequestMapping("/list")
    public List<Post> getListPost(){

        List<Post> postList = postDao.findAll();

        return postList;
    }

}
