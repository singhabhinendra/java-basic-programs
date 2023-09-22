import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet");
        char C=sc.next().charAt(0);
        if ((C=='A'||C=='E'||C=='I'||C=='O'||C=='U') || (C=='a'||C=='e'||C=='i'||C=='o'||C=='u'))
            System.out.println("alphabet is vowel");
        else
            System.out.println("given alphabet is consonant");
    }
}