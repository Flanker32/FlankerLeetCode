package flanker;

import java.util.List;

/**
 * Created by Dell on 2016/12/8.
 */
public class Util {
    public static void displayStringList(List<String> list){
        for(String s:list){
            System.out.println(s);
        }
    }

    public static void showIntMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
