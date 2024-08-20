package com.projek.birthday.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projek.birthday.api.model.Wish;
import com.projek.birthday.service.WishService;

import java.util.List;

@RestController
@RequestMapping("/api/wishes")
@CrossOrigin(origins = "http://localhost:3000")
public class WishController {

    @Autowired
    private WishService wishService;

    @PostMapping
    public ResponseEntity<Wish> createWish(@RequestBody Wish wish) {
        Wish savedWish = wishService.saveWish(wish);
        return new ResponseEntity<>(savedWish, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Wish>> getAllWishes() {
        List<Wish> wishes = wishService.getAllWishes();
        return new ResponseEntity<>(wishes, HttpStatus.OK);
    }
}
