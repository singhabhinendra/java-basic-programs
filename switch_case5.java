//6.Write a Java program to check whether a number is positive, negative or zero using switch case.
import java.util.Scanner;
public class switch_case5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n>0?0:1;
        switch (result){
            case 0:
                System.out.println("number is positive");
                break;
            case 1:
                if(n==0){
                System.out.println("number is zero");
                break;}
            default:
                System.out.println("number is negative");
                break;



        }

    }
}
