public class Walk {
   private int minute1, minute2, destined_time_m, destined_time_hrs;

   public Walk(int minute1, int minute2, int destined_time_m, int destined_time_hrs) {
      this.minute1 = minute1;
      this.minute2 = minute2;
      this.destined_time_m = destined_time_m;
      this.destined_time_hrs = destined_time_hrs;
   }

   public int getMinute1() {
      return this.minute1;
   }

   public int getMinute2() {
      return this.minute2;
   }

   public int getMinutes() {
      return this.destined_time_m;
   }

   public int getHours() {
      return this.destined_time_hrs;
   }

   public String solve() {
      int hrs = getHours();
      int minutes = getMinutes() - (getMinute1() + getMinute2());
      while (minutes > 60 || minutes < 00 || hrs <= 0) {
         if (minutes > 60) {
            minutes -= 40;
            hrs -= 1;
         } else if (minutes < 00) {
            minutes += 60;
            hrs -= 1;
         } else if (hrs > 12) {
            hrs -= 12;
         } else if (hrs <= 0) {
            hrs += 12;
         }
      }
      if (minutes < 10) {
         return hrs + ":0" + minutes;
      } else {
         return hrs + ":" + minutes;
      }
   }

   public void display() {
      System.out.println("You should depart in " + solve() + " in order to get to your destination");
   }
}