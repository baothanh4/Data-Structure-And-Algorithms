package org.example.GeekForGeek;

public class DiceProblem {
    public int dice(int a){
        int ans=0;
        if(a==1){
            ans=6;
        }else if(a==2){
            ans=5;
        }else if(a==3){
            ans=4;
        }else if(a==4){
            ans=3;
        }else if(a==5){
            ans=2;
        }else if(a==6){
            ans=1;
        }
        return ans;
    }
}
