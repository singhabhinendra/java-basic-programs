public class pattern_printing_02 {
        public static void main(String[] args) {
            pattern(75);

        }
        static void pattern( int n){
            for(char i=65;i<=n;i++) {

                for( char j=65;j<=i;j++){
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }


