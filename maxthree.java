import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no1");
        int s= sc.nextInt();
        System.out.println("enter the no2");
        int t=sc.nextInt();
        System.out.println("enter the no3");
        int u=sc.nextInt();
        if (s>u && s>t){
            System.out.println("s is maximum");
        } else if ( t>u && t>s) {
            System.out.println("t is maximum");
        }
        else{
            System.out.println("u is maximum");
        }

    }
}