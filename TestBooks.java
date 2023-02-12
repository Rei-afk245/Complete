import java.util.Scanner;

public class TestBooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int books, m, t, w, thu, f;
        System.out.println("Enter amount of books: ");
        books = input.nextInt();
        System.out.println();
        System.out.println("Enter how many books sold in the day of");
        System.out.print("Monday: ");
        m = input.nextInt();
        System.out.print("Tuesday: ");
        t = input.nextInt();
        System.out.print("Wednesday: ");
        w = input.nextInt();
        System.out.print("Thursday: ");
        thu = input.nextInt();
        System.out.print("Friday: ");
        f = input.nextInt();
        Books b = new Books(books, m, t, w, thu, f);
        b.display();
    }
}
