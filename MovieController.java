import java.util.*;

public class MovieController 
{
   private ArrayList<Movie> movies;
   private FileWrapper file = new FileWrapper();
   
   public MovieController()
   {
      movies = file.loadHardcodedMovies();
   }
   
   
   //1: s�gemetode som returnerer film ud fra kategori
   public ArrayList<Movie> searchByCategory(String category)
   {
      //v�rsgo' at kode...
      return null;
   }
   
   //2: Click p� et bogstav
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