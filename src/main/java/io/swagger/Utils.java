package io.swagger;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by richardspellman on 6/1/17.
 */
public class Utils {

  public static int fibonacci(long n){

    if(Math.abs(n) > 92){
      throw new NumberFormatException();
    } else if(n == 0){
      return 0;
    } else if(n < 0){
      return -1 * (int) Math.pow(-1, n) * fibonacci(n * -1);
    } else if(n < 3){
      return 1;
    }
    int result = 2;
    int g = 1;
    int h = 1;

    for(int i = 2; i < n; i++){
      result = g + h;
      g = h;
      h = result;
    }
    return result;
  }

  public static String reverseWords(String sentence){
    StringTokenizer tokenizer = new StringTokenizer(sentence);
    StringBuilder reversed = new StringBuilder();
    while (tokenizer.hasMoreTokens()){
      reversed.append(reverseWord((String) tokenizer.nextElement()) + " ");
    }
    return reversed.toString();
  }

  public static String reverseWord(String word){
    StringBuilder sb = new StringBuilder();
    for(int i = word.length() - 1; i > -1; i--){
      sb.append(word.charAt(i));
    }
    return sb.toString();
  }

  public static String token(){
    return "";
  }

  public static String triangleType(int a, int b, int c){
    int[] array = {a, b, c};
    Arrays.sort(array);

    if(a <= 0 || b <= 0 || c <= 0){
      return "\"Error\"";
    } else if(array[2] >= array[0] + array[1]){
      return "\"Error\"";
    } else if (a == b & a == c){
      return "\"Equilateral\"";
    } else if(a != b & a != c & b != c){
      return "\"Scalene\"";
    } else if(a == b || a == c || b == c){
      return "\"Isosceles\"";
    }

    return "";
  }

//  public static void main(String[] args){
//    System.out.println(fibonacci(5));
//    System.out.println(fibonacci(-5));
//    System.out.println(fibonacci(6));
//    System.out.println(fibonacci(-6));
//
//    System.out.println(triangleType(0, 0, 0));
//    System.out.println(triangleType(1, 1, 2));
//    System.out.println(triangleType(-1, 0, 1));
//    System.out.println(triangleType(-1, -1, -1));
//    System.out.println(triangleType(-1, 1, 1));
//    System.out.println(triangleType(1, -1, 1));
//    System.out.println(triangleType(1, 1, -1));
//    System.out.println(triangleType(3, 3, 5000));
//    System.out.println(triangleType(1, 1, 2147483647));
//    System.out.println(triangleType(-2147483648, -2147483648, -2147483648));
//    System.out.println(triangleType(1, 1, 1));
//    System.out.println(triangleType(2147483647, 2147483647, 2147483647));
//    System.out.println(triangleType(3, 3, 5));
//    System.out.println(triangleType(10, 10, 5));
//    System.out.println(triangleType(15, 1, 15));
//    System.out.println(triangleType(3, 4, 5));
//    System.out.println(triangleType(5, 3, 4));
//    System.out.println(triangleType(4, 5, 3));
//    System.out.println(triangleType(2147483647, 2147483647, 2147483647));
//
//
//    System.out.println(reverseWords("this is a sentence"));
//    System.out.println(reverseWord("pumpernickel"));
//
//
//  }
}
