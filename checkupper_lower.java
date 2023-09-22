//write a java program to check upper case or lower alphabet.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter character!");
        Scanner sc=new Scanner(System.in);
        char C=sc.next().charAt(0);
        if((C=='A'|| C=='B'|| C=='C'||C=='D'||C=='E'||C=='F'||C=='G'||C=='H'||C=='I'||C=='J'||C=='K'||C=='L'||C=='M'||C=='O'||C=='P'||C=='Q'||C=='R'||C=='S'||C=='T'||C=='U'||C=='V'||C=='W'||C=='X'||C=='Y'||C=='Z'))
            System.out.println("it is upper alphabet");

        else if (C=='a'||C=='b'||C=='c'||C=='d'||C=='e'||C=='f'||C=='g'||C=='h'||C=='i'||C=='j'||C=='k'||C=='l'||C=='m'||C=='n'||C=='o'||C=='p'||C=='q'||C=='r'||C=='s'||C=='t'||C=='u'||C=='v'||C=='w'||C=='x'||C=='y'||C=='z') {
            System.out.println("it is lower case");
        }
    }


}