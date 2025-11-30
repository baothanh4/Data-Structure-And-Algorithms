package org.example.GeekForGeek;

public class PerfectNumber {
    public boolean checkPerfectNumber(int a){
        if(a==0){
            return false;
        }
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum+=i;
            }
            if(sum==a){
                return true;
            }
        }
        return false;
    }
}
