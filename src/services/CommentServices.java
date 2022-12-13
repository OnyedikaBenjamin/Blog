package services;

import data.models.Comment;

import java.util.List;

public interface CommentServices {
    void createComment(String comment, String commenterName);
    void updateComment(int id, String comment, String commenterName);
    void deleteComment(int id);
    Comment viewComment(int id);
    List<Comment> viewAllComment();

}
