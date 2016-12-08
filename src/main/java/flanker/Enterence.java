package flanker;

import flanker.easy.Reverse_String;

import java.util.Scanner;

/**
 * Created by Dell on 2016/12/8.
 */
public class Enterence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Reverse_String.reverseString(scanner.nextLine()));
//        String a = "abc";
//        System.out.println(a.length());
//        System.out.println(a.charAt(2));
    }
}
