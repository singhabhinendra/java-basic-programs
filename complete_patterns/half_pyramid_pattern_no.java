public class half_pyramid_pattern_no {
    public static void main(String[] args) {
        pattern1(4);
    }
        static void pattern1(int n){
            for (int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                   System.out.print(j+ " ");
                }
                System.out.println();
            }
        }

}
