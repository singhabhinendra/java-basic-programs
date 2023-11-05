//Time Complexity for this code will be linear time complexity [O(m)].


//SHORTEST PATH.
import java.util.Scanner;
public class problem_shortest_path {
    public static float shortestpath(String path){
        float x=0,y=0;
        for(int i =0;i<path.length();i++){
            char dir=path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            }
            //North
            else if (dir == 'N') {

                y++;
            }
            //West
            else if (dir=='W'){
                x--;
            }
            //East
            else if(dir=='E'){
                x++;
            }

        }
        float  x2=x*x;
        float y2=y*y;
        return (float)(Math.sqrt(x2+y2));

    }

    public static void main(String[] args) {
        String path="SN";
        System.out.println(shortestpath(path));


    }
}
