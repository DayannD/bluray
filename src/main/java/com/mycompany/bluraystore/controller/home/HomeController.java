package com.mycompany.bluraystore.controller.home;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import com.mycompany.bluraystore.service.console.MovieService;
import com.mycompany.bluraystore.service.file.MovieServiceWithText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    @RequestMapping("/bluraystore-home")
    //@ModelAttribute("movies")
    public String displayHome(Model model){
        List<Movie> movies = movieService.getList();
        System.out.println(movies.toString());
        model.addAttribute("movies",movies);

        return "bluraystore-home";
    }
}
