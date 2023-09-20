//15.	Write a Java program to calculate product of digits of a number.
import java.util.Scanner;
public class productsum {
    public static  void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int pro=1,digit;
        while(m!=0){
            digit=m%10;
            pro=pro*digit;
            m/=10;

        }
        System.out.println(pro);
    }

}
