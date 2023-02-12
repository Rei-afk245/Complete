import java.util.*;

public class textBoxes{
   public static void main(String[] args){
      int big_b;
      Scanner input = new Scanner(System.in);
      System.out.println("Input how many big boxes:");
      big_b = input.nextInt();
      Boxes box = new Boxes(big_b);
      box.display();
   }
}