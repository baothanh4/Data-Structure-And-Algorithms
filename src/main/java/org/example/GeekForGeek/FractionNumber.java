package org.example.GeekForGeek;

import java.util.ArrayList;
import java.util.List;

public class FractionNumber {
    public static int gcd(int n1,int n2){
        if(n1==0){
            return n2;
        }
        return gcd(n2%n1,n1);
    }

    public List<Integer> addFraction(List<Integer> a,List<Integer> b){
        List<Integer> res=new ArrayList<>();

        int den=gcd(a.get(1),b.get(1));

        den=(a.get(1)*b.get(1))/den;

        int num=(a.get(0))*(den/a.get(1))+(b.get(0))*(den/b.get(1));

        int common_factor=gcd(num,den);

        den=den/common_factor;
        num=num/common_factor;

        res.add(num);
        res.add(den);
        return res;
    }
}
