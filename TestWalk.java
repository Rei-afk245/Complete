import java.util.Scanner;

public class TestWalk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minute1, minute2, hrs, minutes;
        System.out.println("How many minutes to get to your first destination: ");
        minute1 = input.nextInt();
        System.out.println("How many minutes to get to your second destination: ");
        minute2 = input.nextInt();
        System.out.println("What time should you arrive (Seperate the hours and minutes with a space)");
        hrs = input.nextInt();
        minutes = input.nextInt();
        Walk walk = new Walk(minute1, minute2, minutes, hrs);
        walk.display();
    }
}
