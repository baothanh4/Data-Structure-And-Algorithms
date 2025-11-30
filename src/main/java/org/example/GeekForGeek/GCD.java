package org.example.GeekForGeek;

import java.math.BigInteger;

public class GCD {
    //option 1: Using Loop - O(min(a, b)) Time and O(1) Space
    public int checkGCD_1(int a,int b){
        int result=Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    //option 2: Euclidean Algorithm using Subtraction - O(min(a,b)) Time and O(min(a,b)) Space
    public int checkGCD_2(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }

        if(a==b){
            return a;
        }

        if(a>b){
            return checkGCD_2(a-b,b);
        }
        return checkGCD_2(a,b-a);
    }

    //option 3: Modified Euclidean Algorithm using Subtraction by Checking Divisibility - O(min(a, b)) Time and O(min(a, b)) Space
    public int checkGCD_3(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }

        if(a>b){
            if(a%b==0){
                return b;
            }
            return checkGCD_3(a-b,b);
        }

        if(b%a==0){
            return a;
        }
        return checkGCD_3(a,b-a);
    }

    //option 4: Optimized Euclidean Algorithm by Checking Remainder
    public int checkGCD_4(int a,int b){
        return (b==0)?a:checkGCD_4(b,a%b);
    }

    //option 5: Using Built-in Function - O(log(min(a, b))) Time and O(1) Space
    public int checkGCD_5(int a,int b){
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
