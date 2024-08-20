package com.projek.birthday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projek.birthday.api.model.Wish;
import com.projek.birthday.repository.WishRepository;

import java.util.List;

@Service
public class WishService {

    @Autowired
    private WishRepository wishRepository;

    public Wish saveWish(Wish wish) {
        return wishRepository.save(wish);
    }

    public List<Wish> getAllWishes() {
        return wishRepository.findAll();
    }
}
