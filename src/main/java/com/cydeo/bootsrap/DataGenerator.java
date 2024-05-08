package com.cydeo.bootsrap;

import com.cydeo.entity.Cinema;
import com.cydeo.entity.Movie;
import com.cydeo.repository.CinemaRepository;
import com.cydeo.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CinemaRepository cinemaRepository;
    private final MovieRepository movieRepository;

    public DataGenerator(CinemaRepository cinemaRepository, MovieRepository movieRepository) {
        this.cinemaRepository = cinemaRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        Cinema cinema1 = new Cinema("Antares", " Ayse Bayrak");
//        Cinema cinema2 = new Cinema("ACity", "Betul Bayrak");

//        cinemaRepository.save(cinema1);
//        cinemaRepository.save(cinema2);

        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

    }
}
