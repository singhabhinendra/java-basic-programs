//WAP in java to initialise an array and print all the elements of array.
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        int i, j;
        System.out.println("enter the element in array");
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        for(i=0;i<r;i++)
           for(j=0;j<c;j++)
//               if (j<=r)
                System.out.print(arr[i][j]);

    }
//    system.out.println("\n");

}

