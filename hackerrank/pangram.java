import java.util.Scanner;
public class pangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String input =sc.nextLine().toLowerCase();
        boolean[] alphabet=new boolean[26];

        for (int i=0;i<n;i++){
            char c=input.charAt(i);
            if (Character.isLetter(c)){
                int index=c-'a';
                alphabet[index]=true;

            }
        }
        boolean isPangram =true;
        for (boolean letter:alphabet){
            if(!letter){
                isPangram=false;
                break;

            }
        }
        if(isPangram){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



    }
}
