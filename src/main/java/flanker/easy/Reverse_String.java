package flanker.easy;

/**
 * Created by Dell on 2016/12/8.
 */
public class Reverse_String {
    public static String reverseString(String s) {
        int length = s.length();
        char[] temple = new char[length];
        for(int i=1;i<=length;i++){
            temple[i-1]=s.charAt(length-i);
        }
        return new String(temple);
    }
}
