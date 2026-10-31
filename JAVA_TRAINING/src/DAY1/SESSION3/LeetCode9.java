package DAY1.SESSION3;

public class LeetCode9 {
 public boolean Palindrome(int x){
    int check=x;
    int reversed=0;
    while(x>0){
        int lastDigit=x%10;
        reversed=reversed*10+lastDigit;
        x=x/10;
    }
    if(check==reversed){
        return  true;
    }
    return false;

 }   
}
