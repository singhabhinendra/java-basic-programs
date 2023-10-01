import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int originaln=n;
        n=2*n;
        for (int row = 0; row<=n; row++){
            for (int col=0;col<=n;col++){
                int ateveryindex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");

            }
            System.out.println();
        }

    }
}
