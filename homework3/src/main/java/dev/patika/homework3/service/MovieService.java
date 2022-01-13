package dev.patika.homework3.service;

import dev.patika.homework3.dao.MovieDao;

import dev.patika.homework3.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieDao movieDao;

    public Optional<List<Movie>> getAllMovies(){
        return Optional.of(movieDao.findAll());
    }

    public Optional<Movie> getMovieById(Long id){
        return Optional.of(movieDao.getById(id));
    }

    public Optional<Movie> saveMovie(Movie movie){
        return Optional.of(movieDao.save(movie));
    }
    public Optional<String > deleteMovieById(Long id){
        movieDao.deleteById(id);
        return Optional.of("Silindi");
    }
}
