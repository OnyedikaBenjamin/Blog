import data.models.Comment;
import data.repositories.CommentRepository;
import data.repositories.CommentRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {

    CommentRepository commentRepository;
    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }
    @Test
    public void commentCanBeSavedTest(){
        Comment comment = new Comment();
        comment.setComment("i like your post");
        comment.setCommenterName("Timmy lee");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());
    }
    @Test
    public void savedcomment_CanBe_FindById_andReturn_savedComment_Test(){
        Comment comment = new Comment();
        comment.setComment("i like your post");
        comment.setCommenterName("Timmy lee");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());

        Comment savedComment = commentRepository.findById(1);
        assertEquals(comment, savedComment);

        Comment comment2 = new Comment();
        commentRepository.save(comment2);
        assertEquals(comment2, commentRepository.findById(2));
    }
    @Test
    public void thatSaved_Comment_CanBe_Updated_Test(){
        Comment comment = new Comment();
        comment.setComment("nice observation");
        comment.setCommenterName("Timmy lee");
        commentRepository.save(comment);

        Comment updatedComment = new Comment();
        updatedComment.setId(1);
        updatedComment.setComment("updated comment");
        updatedComment.setCommenterName("Timmy lee");
        commentRepository.save(updatedComment);
        assertEquals(1L, commentRepository.count());
        assertEquals(comment, commentRepository.findById(1));
    }

    @Test
    public void thatICan_DeleteItemFromDb_Test(){
        Comment comment = new Comment();
        comment.setComment("i like your post");
        comment.setCommenterName("Timmy lee");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());

        commentRepository.delete(1);
        assertEquals(0L, commentRepository.count());
    }

}