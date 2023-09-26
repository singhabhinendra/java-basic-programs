import java.util.*;
public class pallindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;

        }
        if (str.equals(rev)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
