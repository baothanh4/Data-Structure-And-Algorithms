package org.example.GeekForGeek;

public class PalindromeNumber {
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int temp=Math.abs(number);
        int reverse=0;
        while(temp!=0){
            reverse=(reverse*10)+(temp%10);
            temp=temp/10;
        }

        return reverse==Math.abs(number);
    }

    public boolean isPalindrome2(int number){
        String s=Integer.toString(Math.abs(number));
        int len=s.length();

        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
