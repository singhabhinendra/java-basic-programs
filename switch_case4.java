//5.Write a Java program to check whether a number is even or odd using switch case.
import java.util.Scanner;
public class switch_case4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int check=n%2==0?0:1;
        switch (check){
            case 0:
                System.out.println("even no");
                break;
            case 1:
                System.out.println("odd no");
                break;


        }

    }
}
