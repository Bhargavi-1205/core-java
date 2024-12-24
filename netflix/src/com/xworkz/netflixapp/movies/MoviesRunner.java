package com.xworkz.netflixapp.movies;


import java.util.Scanner;

public class MoviesRunner {
    public static void main(String[] args) {
//        Movies movies = new Movies();
//        System.out.println(movies);
//        movies.setMovieName("matinee");
//        movies.setJonar("horror");
//        movies.setNoOfMovies(2);
//        movies.setLanguage("English");
//        System.out.println(movies.hashCode());
//
//        Movies movies1 = new Movies();
//        System.out.println(movies1);
//        movies1.setMovieName("matinee");
//        movies1.setJonar("horror");
//        movies1.setNoOfMovies(2);
//        movies1.setLanguage("English");
//        System.out.println(movies1.hashCode());
//
//       // boolean same = movies.equals(movies1);
//        //System.out.println(same);

        Scanner scanner = new Scanner(System.in);
        Movies movies = new Movies();
        System.out.println("The movie name is ");
        String movieName = scanner.next();
        movies.setMovieName(movieName);
        System.out.println("The jonar of movie is ");
        String jonar = scanner.next();
        movies.setJonar(jonar);
        System.out.println("The total no of movies is ");
        int noOfMovies = scanner.nextInt();
        movies.setNoOfMovies(noOfMovies);
        System.out.println("The language is ");
        String language = scanner.next();
        movies.setLanguage(language);
        System.out.println(movies);


    }
}
