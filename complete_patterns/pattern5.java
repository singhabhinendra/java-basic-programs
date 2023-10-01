public class pattern5 {
    public static void main(String[] args) {
        pattern(4);
        pattern1(4);
    }
    static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=1 ;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
