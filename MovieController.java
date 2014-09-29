import java.util.*;

public class MovieController 
{
   private ArrayList<Movie> movies;
   private FileWrapper file = new FileWrapper();
   
   public MovieController()
   {
      movies = file.loadHardcodedMovies();
   }
   
   
   //1: søgemetode som returnerer film ud fra kategori
   public ArrayList<Movie> searchByCategory(String category)
   {
      //værsgo' at kode...
      return null;
   }
   
   //2: Click på et bogstav
   public ArrayList<Movie> searchByFirstLetterInTitle(String firstLetter)
   {
      return null;   
   }
   
   //3: Find en film ud fra title
   public Movie getByTitle()
   {
      return null;      
   }
   
   
   //4: Find film med denne skuespiller.
   public ArrayList<Movie> findByActorName(String actorName)
   {
      return null;
   }
}