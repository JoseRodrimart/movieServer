package com.jose.movieserver.controller;

import com.jose.movieserver.entities.Movie;
import com.jose.movieserver.exceptions.MovieNotFoundException;
import com.jose.movieserver.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/api/movie")
    public List<Movie> getMovies(){
        return movieService.findAllMovies();
    }

    @GetMapping("/api/movie/{id}")
    public Movie getMovie(@PathVariable Long id){
        return movieService.findMovie(id).orElseThrow(()->new MovieNotFoundException(id));
    }
}
