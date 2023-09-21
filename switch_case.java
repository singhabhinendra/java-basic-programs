//write a java program print total number of days in a month using switch case.
import java.util.*;
public class switch_case {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("number of days");
        String n=sc.nextLine();
        switch (n){
            case "january":
                System.out.println("31");
                break;
            case "march":
                System.out.println("28");
                break;
            case "april":
                System.out.println("30");
                break;
            case "may":
                System.out.println("31");
                break;
            case "june":
                System.out.println("30");
                break;
            case"july":
                System.out.println("31");
                break;
            case "august":
                System.out.println("31");
                break;
            case "september":
                System.out.println(30);
                break;
            case "october":
                System.out.println(31);
            case "november":
                System.out.println(30);
                break;
            case "december":
                System.out.println(31);
                break;




        }



    }
}
