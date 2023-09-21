import java.util.Scanner;

//7.	Write a Java program to create Simple Calculator using switch case.
public class switch_case6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        char n=sc.next().charAt(0);
        switch (n){
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            default:
                System.out.println("enter a  valid character and try again!!");

        }
    }
}
