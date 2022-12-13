package services;

import data.models.Post;
import dtos.CreatePostRequest;

import java.util.List;

public interface PostServices {
    void CreatePost(CreatePostRequest createPostRequest);
    void updatedPost(int id, String title, String body);
    void deletePost(int id);
    Post viewPost(int id);
    List<Post> viewAllPost();

}
