package com.mycompany.bluraystore.controller;

import com.mycompany.bluraystore.service.MovieServiceInterface;

public interface MovieControllerInterface {

    public void createMovie();

    public void setMovieService(MovieServiceInterface movieService);
}
