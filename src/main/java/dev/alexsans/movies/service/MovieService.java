package dev.alexsans.movies.service;

import dev.alexsans.movies.repository.MovieRepository;
import dev.alexsans.movies.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findByImdbId(String id) {
        return movieRepository.findByImdbId(id);
    }
}
