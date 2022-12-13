package com.mycompany.bluraystore.service.console;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class MovieService implements MovieServiceInterface {

    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.createMovie(movie);
    }

    @Override
    public List getList() {
        return null;
    }
}
