import java.util.Scanner;
public class football {
    public static void main(String args[]){
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if((s.contains("0000000")) || (s.contains("1111111")))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
}

