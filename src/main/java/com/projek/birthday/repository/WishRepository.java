package com.projek.birthday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projek.birthday.api.model.Wish;

@Repository
public interface WishRepository extends JpaRepository<Wish, Long> {
}
