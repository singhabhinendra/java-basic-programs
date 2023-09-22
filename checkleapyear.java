import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year ");
        double n=sc.nextDouble();
        if(n%4==0 && n%100!=0)
            System.out.println("year is leap");
        else
            System.out.println("not leap");
    }
}