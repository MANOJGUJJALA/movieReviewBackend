package dev.manoj.movies.Service;


import dev.manoj.movies.Movie;
import dev.manoj.movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public List<Movie> allMovies(){

        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String  imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
