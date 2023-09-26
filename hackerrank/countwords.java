import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String[]a=s.split(" ");
        int i=0;
        for(i=0;i<a.length;i++){
            //System.out.println(" "+a[i]);
            count++;
            //system.out.println(i);
        }
        System.out.println(count);
    }
}
