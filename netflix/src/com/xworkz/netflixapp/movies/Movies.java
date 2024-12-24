package com.xworkz.netflixapp.movies;

public class Movies {
    private String movieName;
    private String jonar;
    private int noOfMovies;
    private String language;

    public Movies(){
        System.out.println("Movies cons is invoked");
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setJonar(String jonar) {
        this.jonar = jonar;
    }

    public String getJonar() {
        return jonar;
    }

    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }

    public int getNoOfMovies() {
        return noOfMovies;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
//  @Override
//  public int hashCode(){
//        return  this.noOfMovies;
//  }
//    @Override
  public String toString(){
      return "movie-(movieName ="+this.movieName+","+
               "jonar ="+this.jonar +","+
               "noOfMovies ="+this.noOfMovies +","+
                "language ="+this.language+")";
   }
//    @Override
//    public int hashCode(){
//      return this.noOfMovies;
//    }
//    @Override
//    public boolean equals(Object Obj){
//        Movies movies = (Movies)Obj;
//        if(this.movieName == movies.movieName && this.jonar == movies.jonar && this.noOfMovies == movies.noOfMovies && this.language == movies.language)
//            return true;
//
//          return false;
//
//    }
}
