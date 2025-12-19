package org.example.GeekForGeek;

public class NthOfSum {
    public int checkNth(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public int term(int n){
        return n*(n+1)/2;
    }
}
