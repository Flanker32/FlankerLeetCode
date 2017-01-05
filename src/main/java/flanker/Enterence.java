package flanker;

import flanker.easy.Island_Perimeter;
import flanker.easy.Reverse_String;

import java.util.Scanner;

/**
 * Created by Dell on 2016/12/8.
 */
public class Enterence {
    public static void main(String[] args){

        //int[][] test ={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] test ={{1},{0}};
//        Scanner scanner = new Scanner(System.in);
        System.out.println(Island_Perimeter.islandPerimeter(test));
//        String a = "abc";
//        System.out.println(a.length());
//        System.out.println(a.charAt(2));
    }
}
