package services;

import data.models.Comment;
import data.repositories.CommentRepository;
import data.repositories.CommentRepositoryImpl;

import java.util.List;

public class CommentServicesImpl implements CommentServices{
    private CommentRepository commentRepository = new CommentRepositoryImpl();
    @Override
    public void createComment(String comment, String commenterName) {

    }

    @Override
    public void updateComment(int id, String comment, String commenterName) {

    }

    @Override
    public void deleteComment(int id) {

    }

    @Override
    public Comment viewComment(int id) {
        return null;
    }

    @Override
    public List<Comment> viewAllComment() {
        return null;
    }
}
