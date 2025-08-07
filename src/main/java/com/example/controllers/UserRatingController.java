package com.example.controllers;

import com.example.models.UserRating;
import com.example.repositories.UserRatingRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ratings")
public class UserRatingController {

    private final UserRatingRepository repository;

    public UserRatingController(UserRatingRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @ResponseBody
    public List<UserRating> getUserRatings(Authentication auth) {
        return repository.findByUsername(auth.getName());
    }

    @PostMapping
    public String saveUserRating(@ModelAttribute UserRating rating, Authentication auth) {
        rating.setUsername(auth.getName());
        repository.save(rating);
        return "redirect:/";
    }

    // 🟢 Ändra från @DeleteMapping till @PostMapping för formulär-stöd
    @PostMapping("/{id}")
    public String deleteRating(@PathVariable Long id, Authentication auth) {
        UserRating rating = repository.findById(id).orElse(null);
        if (rating != null && rating.getUsername().equals(auth.getName())) {
            repository.deleteById(id);
        }
        return "redirect:/"; // 👈 så att man stannar kvar på / efter radering
    }
}
