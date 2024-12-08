package homeWorks;

import java.util.Scanner;
public class EachConditionOfTwo {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        if ( n%3==0 && n%2==0 && n>=10 && n<=99){
            System.out.println("YES");
        }else  {
            System.out.println("NO");
        }
        }
    }
