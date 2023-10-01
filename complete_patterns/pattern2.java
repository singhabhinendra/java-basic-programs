public class pattern2 {
        public static void main(String args[]){
            pattern1(5);//call the function with argument with no return.
        }
        static void pattern1(int n) {//defining a function for printing pattern.
            for (int row = 1; row <= n; row++){//for no of rows less than no of lines (n).
                for (int col=1;col<=n;col++){//for no of columns less than no of rows(i).
                    System.out.print("* ");//print * for inner loop at the range of rows.
                }
                //when one row is printed,we need to add a newline.
                System.out.println();//for next line.
            }
        }
}

