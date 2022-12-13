package data.repositories;

import data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    Post findById(int id);
    List<Post> findAll();
    Long count();
    void delete(Post post);
    void delete(int id);

}