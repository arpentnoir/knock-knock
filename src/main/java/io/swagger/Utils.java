package io.swagger;

import java.util.StringTokenizer;

/**
 * Created by richardspellman on 6/1/17.
 */
public class Utils {

  public static int fibonacci(long n){

    if(n == 0){
      return 0;
    } else if(n < 0){
      return -1 * fibonacci(n * -1);
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
    return "";
  }

  public static void main(String[] args){
    System.out.println(reverseWords("this is a sentence"));
    System.out.println(reverseWord("pumpernickel"));
  }
}
