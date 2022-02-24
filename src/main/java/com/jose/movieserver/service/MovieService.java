package com.jose.movieserver.service;

import com.jose.movieserver.entities.Movie;
import com.jose.movieserver.exceptions.MovieNotFoundException;
import com.jose.movieserver.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

    public void saveMovie(Movie... movie){
        movieRepository.saveAll(Arrays.asList(movie));
    }

    public void removeById(Long id){
        Movie movie = movieRepository.findById(id).orElseThrow(()->new MovieNotFoundException(id));
        movieRepository.delete(movie);
    }

    public Optional<Movie> findMovie(Long id) {
        return movieRepository.findById(id);
    }
}
