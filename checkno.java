import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no -");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("given no is postive");

        else if (n==0)
            System.out.println("no is zero");
        else
            System.out.println("given no is negative");
    }
}