package com.amigos.learn.sbm.jsonplaceholder;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonPlaceHolder", url = "https://jsonplaceholder.typicode.com/")
@Component
public interface JsonPlaceHolderClient {

    @GetMapping(path = "posts")
    List<Post> getPosts();

    @GetMapping(path = "posts/{postId}")
    Post getPost(@PathVariable("postId") Integer postId);


}
