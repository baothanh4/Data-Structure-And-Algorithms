package org.example.GeekForGeek;

public class LCM {
    //option 1: Conditional loop
    public int checkLCM_1(int a,int b){
        int t=1;
        while(t%a!=0 || t%b!=0){
            t++;
        }
        return t;
    }

    //option 2: Using LCM GCD formula
    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }

    public int checkLCM_2(int a,int b){
        return (a/gcd(a,b))*b;
    }
}
