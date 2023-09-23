//wap in java to print n to 1 natural no by using do while loop
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i=0;
        do {
            System.out.println(i);
            i++;

        }while(i<=n);

    }
}