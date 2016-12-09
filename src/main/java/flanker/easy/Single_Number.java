package flanker.easy;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Dell on 2016/12/9.
 */
public class Single_Number {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Boolean> temple = new HashMap<Integer, Boolean>();
        for(int i:nums){
            if(temple.containsKey(i)){
                temple.put(i,false);
            }else{
                temple.put(i,true);
            }
        }
        for(int i:temple.keySet()){
            if(!temple.get(i)){
                return i;
            }
        }
        return 0;
    }
}
