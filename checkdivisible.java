import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no1");
        int n =sc.nextInt();
        if (n%5==0 && n%11==0)
            System.out.println("no is divisible by both no");
        else
            System.out.println("no is not divisible by not 5 and 11");

    }
}