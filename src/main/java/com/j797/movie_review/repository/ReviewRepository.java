package com.j797.movie_review.repository;

import com.j797.movie_review.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findByMovieId(Long movieId, Pageable pageable);
}