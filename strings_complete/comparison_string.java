public class string_comparison{
    public static void main(String[] args) {
        String s1="abhi";
        String s2="abhi";
        String s3=new String("abhi");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
