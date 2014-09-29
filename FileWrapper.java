import java.util.*;

public class FileWrapper
{
   public ArrayList<Movie> loadHardcodedMovies()
   {
      Actor actor1 = new Actor("Mel Gibson", 1948, Gender.MALE);
      Actor actor2 = new Actor("Marissa Tomey", 1978, Gender.FEMALE);
      ArrayList<Actor> actors = new ArrayList<Actor>(); //her opretter vi listen
      
      actors.add(actor1);
      actors.add(actor2);
       
      
//      (String title, int releaseYear, String genre, String linkToMore, int rating, ArrayList<Actor> actors)
      Movie movie1 = new Movie("What women wan't", 2000,"Comedy", "www.more.dk", 6, actors);
      
      Movie movie2 = new Movie("What women wan't 2", 2001, "Comedy", "www.more.dk", 5, actors);   

      ArrayList<Movie> movies = new ArrayList<Movie>(); //her opretter vi listen      
      movies.add(movie1);
      movies.add(movie2);
      
      return movies;
   }
}