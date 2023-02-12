import java.util.*;

public class TestMinutes {
   public static void main(String[] args){
      int week;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter how many weeks: ");
      week = input.nextInt();
      Minutes min = new Minutes(week);
      min.display();
   }
}