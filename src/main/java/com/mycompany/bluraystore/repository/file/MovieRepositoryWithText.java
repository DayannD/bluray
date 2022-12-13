package com.mycompany.bluraystore.repository.file;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryWithText implements MovieRepositoryInterface {
    @Value("${movies.file.location}")
    private File file;
    public void createMovie(Movie movie){
        FileWriter writer;

        try{
            writer=new FileWriter(file,true);
            writer.write( movie.toString() + " \n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Movie> list() {


        List<Movie> movies=new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                final Movie movie=new Movie();
                final String[] titreEtGenre = line.split("\\;");
                movie.setTitle(titreEtGenre[0]);
                movie.setGenre(titreEtGenre[1]);
                movie.setActeur(titreEtGenre[2]);
                movie.setNumberExemple(Long.parseLong(titreEtGenre[3]));
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
