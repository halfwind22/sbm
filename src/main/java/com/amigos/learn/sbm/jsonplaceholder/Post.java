package com.amigos.learn.sbm.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private final Long userId;
    private final Integer postId;
    private final String title;
    private final String body;
}
