package org.example.GeekForGeek;

public class SumOfSquare {
    public int totalOfSquares(int n){
        int sum=0;
        while(n>0){
            sum+=(n*n);
            --n;
        }
        return sum;
    }
}
