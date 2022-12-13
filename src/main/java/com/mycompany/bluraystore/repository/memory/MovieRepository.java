package com.mycompany.bluraystore.repository.memory;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MovieRepository implements MovieRepositoryInterface {

    private static List<Movie> movies = new ArrayList<>();

    public void createMovie(Movie movie){
        movies.add(movie);
        System.out.println("Movie called" + movie.getTitle() + " has been added ! ");
    }

    @Override
    public List list() {
        return movies;
    }
}
