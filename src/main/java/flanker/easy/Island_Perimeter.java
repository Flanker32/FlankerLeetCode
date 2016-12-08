package flanker.easy;

/**
 * Created by Dell on 2016/12/8.
 */
public class Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int length = grid.length;
        int high = grid[0].length;
        int[][] temple = new int[length+1][high+1];
        int[][] record = new int[length][high];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                temple[i+1][j+1]=grid[i][j];
            }
        }
        for(int i=1;i<length;i++){
            for(int j=1;j<length;j++){
                if(temple[i][j]==1){
                    record[i-1][j-1]=4-(temple[i-1][j]+temple[i+1][j]+temple[i][j-1]+temple[i][j+1]);
                }
            }
        }

        return result;
    }
}
