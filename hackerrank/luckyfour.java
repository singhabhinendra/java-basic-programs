public class luckyfour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        long m;
        long n=sc.nextLong();
        for(int i=0;i<n;i++){
            m=sc.nextLong();
            while(m!=0){
                long ans=m%10;
                if(ans==4){
                    count++;}


                m=m/10;}

            System.out.println(count);
            count=0;
        }
    }
}
