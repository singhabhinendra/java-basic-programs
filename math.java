import java.util.Scanner;
public class Main {
    static double area_of_circle(int r)
    {
        double k=3.14*r*r;
        return k;
    }
    static void area_of_rect(int l,int b)
    {
        System.out.println(l * b);
    }
    public static void Main (String[]args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        int a,b;
        System.out.println("enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        double k=area_of_circle(5);
        System.out.println("area of circle is "+ k);
        area_of_rect(a,b);
    }

}