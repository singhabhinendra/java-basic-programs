//time complexity of this code is linear time complexity [O(n)].
public class check_pallindrome {
    public static boolean checkpallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                //not a pallindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abhinendra singh";
        System.out.println(checkpallindrome(str));

    }
}
