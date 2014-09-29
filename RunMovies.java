public class RunMovies
{
   public static void main(String[] args)
   {
      MovieController controller = new MovieController();
      
      Movie movie1 = controller.getByTitle();
      
//      System.out.println(movie1.getTitle());
   }
}