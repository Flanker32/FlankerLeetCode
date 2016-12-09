package flanker.easy;

import flanker.Util;

/**
 * Created by Dell on 2016/12/8.
 */
public class Island_Perimeter {
    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        int length = grid.length;
        int high = grid[0].length;
        int[][] temple = new int[length+2][high+2];
//        int[][] record = new int[length][high];
        for(int i=0;i<length;i++){
            for(int j=0;j<high;j++){
                temple[i+1][j+1]=grid[i][j];
            }
        }
        //Util.showIntMatrix(temple);
        for(int i=1;i<=length;i++){
            for(int j=1;j<=high;j++){
                if(temple[i][j]==1){
                    //record[i-1][j-1]=4-(temple[i-1][j]+temple[i+1][j]+temple[i][j-1]+temple[i][j+1]);
                    result+=4-(temple[i-1][j]+temple[i+1][j]+temple[i][j-1]+temple[i][j+1]);
                }
            }
        }
        //Util.showIntMatrix(record);
//        for(int i=0;i<length;i++){
//            for(int j=0;j<high;j++){
//                result+=record[i][j];
//            }
//        }
        return result;
    }
}
