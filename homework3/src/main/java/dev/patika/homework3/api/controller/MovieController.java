package dev.patika.homework3.api.controller;

import dev.patika.homework3.model.Movie;
import dev.patika.homework3.service.MovieService;
import dev.patika.homework3.service.PuanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    private final PuanService puanService;
    @GetMapping
    public ResponseEntity getAllMovies(){
        return new  ResponseEntity<>(movieService.getAllMovies().get(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getMovieById(@PathVariable Long id) {
        return new ResponseEntity<>(movieService.getMovieById(id).get(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.saveMovie(movie).get(),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMovieById(@PathVariable Long id){
        return new ResponseEntity<>(movieService.deleteMovieById(id).get(),HttpStatus.OK);
    }



}
