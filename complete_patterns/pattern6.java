public class pattern6 {
    public static void main(String[] args) {
            pattern(5);//call the function with argument with no return;
        }
        static void pattern(int n) {//defining a function for printing pattern.
            for (int row = 0; row <=2 * n; row++){
                int c=row>n?2*n-row:row;//for no of rows less than no of lines (n).

                for (int col=0;col<=c;col++){//for no of columns less than no of rows(i).
                    System.out.print(" * ");//print * for inner loop at the range of rows.
                }
                //when one row is printed,we need to add a newline.
                System.out.println();//for next line.

            }
        }
}
