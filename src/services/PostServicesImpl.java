package services;

import data.models.Post;
import data.repositories.PostRepository;
import data.repositories.PostRepositoryImpl;
import dtos.CreatePostRequest;

import java.util.List;

public class PostServicesImpl implements PostServices{

    private PostRepository postRepository = new PostRepositoryImpl();

    @Override
    public void CreatePost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);
    }

    @Override
    public void updatedPost(int id, String title, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return null;
    }

    @Override
    public List<Post> viewAllPost() {
        return null;
    }
}
