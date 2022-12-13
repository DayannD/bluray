package com.mycompany.bluraystore.controller.file;

import com.mycompany.bluraystore.controller.MovieControllerInterface;
import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class MovieControllerWithText implements MovieControllerInterface {
    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    @Override
    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void createMovie(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("titre du film");
        String title = scanner.nextLine();
        System.out.println("genre?");
        String genre = scanner.nextLine();
        System.out.println("acteur?");
        String acteur = scanner.nextLine();
        System.out.println("nombre d'exemplaire");
        long exemple = scanner.nextLong();

        Movie movie = new Movie(title,exemple,genre,acteur);

        movieService.registerMovie(movie);
    }
}
