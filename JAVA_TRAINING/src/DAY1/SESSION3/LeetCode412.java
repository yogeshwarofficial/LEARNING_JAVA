package DAY1.SESSION3;

import java.util.Arrays;

public class LeetCode412 {
 public static String[] fizzBuzz(int n){
    String[] result=new String[n];
    for(int i=1;i<=n;i++){
        if(i%3==0&&i%5==0){
            result[i-1]="FizzBuzz";
        }
        else if(i%3==0){
            result[i-1]="Fizz";
        }
        else if(i%5==0){
            result[i-1]="Buzz";
        }
        else{
            result[i-1]=String.valueOf(i);
        }
    
    } 
    return result;   
 }   

 public static void main(String[] args) {
    int n=5;
    String[] result=fizzBuzz(n);
    System.out.println(Arrays.toString(result));
 }
}
