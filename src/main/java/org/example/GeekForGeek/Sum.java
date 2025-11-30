package org.example.GeekForGeek;

public class Sum {
    public int sum(int a){
        int sum=0;
        while(a>0){
            sum=sum+a;
            --a;
        }
        return sum;
    }
}
