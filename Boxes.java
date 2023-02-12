public class Boxes{
   private int big_b,small_b;
   
   public Boxes(int big_b){
      this.big_b = big_b;
   }
   public int getBig_B(){
      return this.big_b;
       
   }
   public int solve1(){
      return getBig_B() * 20;
   }
   public int solve2(){
      return solve1() * 30;
   }
   public void display(){
      System.out.println("There are " + solve2() + " candy bards in the big box");
   }
}