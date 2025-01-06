package eolympTasks;
import java.util.Scanner;
public class KoronaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        if (a + b + c == 2020) {
            System.out.println(a + "+" + b + "+" + c);
        } else if (a + b - c == 2020) {
            System.out.println(a + "+" + b + "-" + c);
        } else if (a - b + c == 2020) {
            System.out.println(a + "-" + b + "+" + c);
        } else if (a - b - c == 2020) {
            System.out.println(a + "-" + b + "-" + c);
        } else if (b + a + c == 2020) {
            System.out.println(b + "+" + a + "+" + c);
        } else if (b + a - c == 2020) {
            System.out.println(b + "+" + a + "-" + c);
        } else if (b - a + c == 2020) {
            System.out.println(b + "-" + a + "+" + c);
        } else if (b - a - c == 2020) {
            System.out.println(b + "-" + a + "-" + c);
        } else if (c + a + b == 2020) {
            System.out.println(c + "+" + a + "+" + b);
        } else if (c + a - b == 2020) {
            System.out.println(c + "+" + a + "-" + b);
        } else if (c - a + b == 2020) {
            System.out.println(c + "-" + a + "+" + b);
        } else if (c - a - b == 2020) {
            System.out.println(c + "-" + a + "-" + b);
        } else {
            System.out.println("CORONA");
        }
    }
}

