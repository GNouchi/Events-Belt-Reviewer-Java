package com.coding.BeltReviewer.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.coding.BeltReviewer.Models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
