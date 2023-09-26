import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in) ;
        String s=sc.nextLine();
        String str=s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.print(str);
    }
}
