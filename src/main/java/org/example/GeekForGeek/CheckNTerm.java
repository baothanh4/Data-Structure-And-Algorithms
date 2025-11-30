package org.example.GeekForGeek;

public class CheckNTerm {
    public int checkNTerm(int a,int b,int n) {
        int d=b-a;
        int nth=a;
        for(int i=a;i<=n;i++){
            nth+=d;
        }
        return nth;
    }
}
