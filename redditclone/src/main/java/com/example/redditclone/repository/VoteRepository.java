package com.example.redditclone.repository;

import com.example.redditclone.model.PostModel;
import com.example.redditclone.model.UserModel;
import com.example.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(PostModel post, UserModel currentUser);
}
