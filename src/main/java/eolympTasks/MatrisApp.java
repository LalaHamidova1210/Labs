package eolympTasks;
import java.util.Scanner;
public class MatrisApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //setir
        int m = in.nextInt(); // sutun
        int number = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(number + " ");
                number++;
            }
        }       System.out.println();
    }}