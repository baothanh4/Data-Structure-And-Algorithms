package org.example.GeekForGeek;

public class ValidTriangle {
    public String checkTriangle(int a,int b,int c){
        if(a<=0 || b<=0 || c<=0){
            return "Invalid";
        }

        if((a+b)>c && (a+c)>b && (b+c)>a){
            return "Valid";
        }
        return "Invalid";
    }
}
