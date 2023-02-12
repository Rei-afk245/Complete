import java.util.Scanner;

public class TestMillimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mm;
        System.out.println("Enter Millimeters to be converted to inches: ");
        mm = input.nextInt();
        Millimeters inches = new Millimeters(mm);
        inches.display();
    }
}
