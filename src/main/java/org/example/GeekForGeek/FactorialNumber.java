package org.example.GeekForGeek;

public class FactorialNumber {
    public int factorial(int number){
        if(number == 0){
            return 0;
        }
        int t=1;
        for(int i=1;i<=number;i++){
            t=t*i;
        }
        return t;
    }
}
