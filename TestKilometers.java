import java.util.Scanner;

public class TestKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilometers;
        System.out.println("Enter Kilometers");
        kilometers = input.nextInt();
        Kilometers kilo_m = new Kilometers(kilometers);
        kilo_m.display();

    }
}
