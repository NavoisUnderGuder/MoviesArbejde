import java.util.*;

public class Movie 
{
   private String title;
   private int releaseYear;
   private String genre;
   private String linkToMore;
   private int rating; //1-6. Could be enum.
   private ArrayList<Actor> actors;
   
   public Movie(String title, int releaseYear, String genre, String linkToMore, int rating, ArrayList<Actor> actors)
   {
      this.title = title;
      this.releaseYear = releaseYear;
      //gør resten færdig...
   }
   
}