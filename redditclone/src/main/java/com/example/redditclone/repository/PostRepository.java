package com.example.redditclone.repository;

import com.example.redditclone.model.PostModel;
import com.example.redditclone.model.Subreddit;
import com.example.redditclone.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {

    List<PostModel> findAllBySubreddit(Subreddit subreddit);

    List<PostModel> findByUser(UserModel user);
}
