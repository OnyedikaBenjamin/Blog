package data.repositories;

import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private List<Comment> commentDb = new ArrayList<>();
    int count;
    @Override
    public Comment save(Comment comment) {
        if (comment.getId()!=0)update(comment);
        else {
            comment.setId(++count);
            commentDb.add(comment);
        }
        return comment;
    }
    public void update(Comment comment){
        Comment savedComment = findById(comment.getId());
        savedComment.setComment(comment.getComment());
        savedComment.setCommenterName(comment.getCommenterName());
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment: commentDb) if (comment.getId()==id) return comment;
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return commentDb;
    }

    @Override
    public Long count() {
        return (long) commentDb.size();
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < commentDb.size() ; i++){
            Comment item = commentDb.get(i);
            if (item.getId()==id){
                commentDb.remove(item);
                break;
            }
        }
    }
}
