//4	4.	Write a Java program to find maximum between two numbers using switch case.
import java.util.Scanner;
public class switch_case3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=a>b?0:1;

        switch (result){
            case 0:
                System.out.println("max is "+ a);
                break;
            case 1:
                System.out.println("max is "+b);
                break;

        }
    }
}

