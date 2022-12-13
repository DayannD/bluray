package com.mycompany.bluraystore.service;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;

import java.util.List;

public interface MovieServiceInterface {

    public void registerMovie(Movie movie);

    public void setMovieRepository(MovieRepositoryInterface movieRepository);

    public List getList();

}
