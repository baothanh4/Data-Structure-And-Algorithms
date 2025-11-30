package org.example.GeekForGeek;

public class ReverserNumber {
    public int reverse(int n){
        int revNum = 0;
        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        return revNum;
    }
}
