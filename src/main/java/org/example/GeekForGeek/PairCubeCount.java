package org.example.GeekForGeek;

public class PairCubeCount {
    public int cubeCount(int n){
        int count=0;
        for(int a=1; a<=n; a++){
            for(int b=1; b<=n; b++){
                if(a*a*a+b*b*b==n){
                    count++;
                }
            }
        }
        return count;
    }
}
