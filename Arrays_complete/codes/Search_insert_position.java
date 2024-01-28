import java.util.Scanner;
public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int n=arr.length;
        int low=0,high=n-1,ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=m){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        
        return ans;
    }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n-1;i++){
      arr[i]=sc.nextInt();
    }
    searchInsert(arr,m);
}



