package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dell on 2016/12/8.
 */
public class Fizz_Buzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Util.displayStringList(fizzBuzz(input));
    }

    public static List<String> fizzBuzz(int n)
    {
        String three = "Fizz";
        String five= "Buzz";
        String fifteen = "FizzBuzz";
        String[] list = new String[n];
//        for(int i=0;i<n;i++){
//            list[i]=String.valueOf(i);
//        }
//        for(int i=2;i<n;i=i+3){
//            list[i]=three;
//        }
//        for(int i=4;i<n;i=i+5){
//            list[i]=five;
//        }
//        for(int i=14;i<n;i=i+15){
//            list[i]=fifteen;
//        }

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    list[i-1]=fifteen;
                } else {
                    list[i-1]=three;
                }
            } else if (i % 5 == 0) {
                list[i-1]=five;
            } else {
                list[i-1] = i + "";
            }
        }
        List<String> result = Arrays.asList(list);
        return result;
    }
//    public static List<String> fizzBuzz(int n) {
//        List<String> result = new ArrayList<String>();
//        for(int i=1;i<n+1;i++){
//            if(i%3==0){
//                if(i%5==0){
//                    result.add("FizzBuzz");
//                }else{
//                    result.add("Fizz");
//                }
//            }else if(i%5==0){
//                result.add("Buzz");
//            }else{
//                result.add(i+"");
//            }
//        }
//        return result;
//    }
}
