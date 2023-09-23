/*wap in java to print 1 to n natural no. by while loop*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int i=0;
        while(i<n){
            i++;
            System.out.println(i);
        }


    }
}