package lesson01;
import java.util.Scanner;
public class Task04App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  =sc.nextInt();
        int [] array=new int [number];
        for ( int i =0; i < number; i++){
            array [i]=sc.nextInt();
        }
        int max = array[0];
        for ( int i=0; i<number; i++ ){
            if ( max<array [i]){
                max=array [i];
            }
        }
        System.out.println(max);


    }
}
