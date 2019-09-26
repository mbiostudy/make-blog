package com.mbiostudy.blog.controller;


import com.mbiostudy.blog.repository.PostDao;
import com.mbiostudy.blog.vo.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PostContoller {

    @Autowired
    PostDao postDao;

    @RequestMapping("/")
    public String index() {
        return "helloworld!";
    }

    @RequestMapping(value="/insert" ,method= RequestMethod.POST)
    public Map insertPost(Post post){
        Date sysdate = new Date();
        post.setRegDate(sysdate);
        post.setUpdtDate(sysdate);
        Post postData = postDao.save(post);

        Map responseMap  = new HashMap();
        responseMap.put("statusCode",200);
        responseMap.put("data",postData);

        return responseMap;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deletePost(Long postId){

        Post deleteTarget = postDao.getOne(postId);
        if(ObjectUtils.isEmpty(deleteTarget)) {
            postDao.deleteById(postId);
        }
        return "deleted";
    }

    @RequestMapping("/list")
    public Map<String,Object> selectAll(){

        List<Post> postList = postDao.findAll();
        long totalCount = postDao.count();

        Map responseMap = new HashMap();
        responseMap.put("statusCode",200);
        responseMap.put("totalCount",totalCount);
        responseMap.put("items",postList);

        return responseMap;
    }

    @RequestMapping("/post/{id}")
    public Map getPostOne(@PathVariable("id") Long postId){

        Object post = postDao.findById(postId);

        Map responseMap  = new HashMap();
        responseMap.put("statusCode",200);
        responseMap.put("data",post);

        return responseMap;
    }


}
