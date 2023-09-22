import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("given no is even");
        }
        else {
            System.out.println("given no is odd");
        }

    }
}