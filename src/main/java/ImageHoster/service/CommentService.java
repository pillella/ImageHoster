package ImageHoster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	//The method calls the addComment() method in the Repository and persists comment in database
	public Comment addComment(Comment comment) {
		return commentRepository.addComment(comment);
	}
	
	//Call the getAllComments() method in the Repository and obtain a List of all the Comments in the database based on image id
	public List<Comment> getAllComments(Integer imageId, String imageTitle) {
		return commentRepository.getAllComments(imageId, imageTitle);
  }

}
