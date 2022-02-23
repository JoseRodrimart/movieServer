package com.jose.movieserver.configuration;

import com.jose.movieserver.entities.Movie;
import com.jose.movieserver.repository.MovieRepository;
import com.jose.movieserver.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class Initialization implements CommandLineRunner {

    @Autowired
    MovieService movieService;
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {

        Movie movie = new Movie("Reservoir Dogs", date.parse("21-01-1992"), "Quentin Tarantino","Eight men eat breakfast at a Los Angeles diner. Except for leader Joe Cabot and his son Nice Guy Eddie, all of the other men use aliases: Mr. Brown, White, Blonde, Blue, Orange, and Pink. " );
        Movie movie2 = new Movie("Kill Bill", date.parse("10-10-2003"), "Quentin Tarantino","A woman in a wedding dress, the Bride, lies wounded in a chapel in El Paso, Texas, having been attacked by the Deadly Viper Assassination Squad. She tells their leader, Bill, that she is pregnant with his baby just before he s." );
        Movie movie3 = new Movie("Inglorious Basterds", date.parse("01-01-2009"), "Quentin Tarantino","In 1941, SS-Standartenführer Hans Landa interrogates French farmer Perrier LaPadite as to the whereabouts of a Jewish family, the Dreyfuses. Landa suspects the Dreyfuses are hiding under " );

        movieService.saveMovie(movie,movie2,movie3);
    }
}
