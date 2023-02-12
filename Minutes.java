public class Minutes{
   private int week;

public Minutes(int week){
   this.week = week;
}

public int getWeek(){
   return this.week;
}
public int Solve(){
   return 60 * 24 * 7 * getWeek();
}
public void display(){
   System.out.println("There are " + Solve() + " minutes in " + getWeek() + " weeks");
}


}