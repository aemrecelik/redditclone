package com.example.redditclone.repository;

import com.example.redditclone.model.Comment;
import com.example.redditclone.model.PostModel;
import com.example.redditclone.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(PostModel post);

    List<Comment> findAllByUser(UserModel user);
}
