package org.example.GeekForGeek;

public class DecimalToBinary {

    //Division by 2 - O(log₂(n)) Time and O(log₂(n)) Space
    public String decToBinary_1(int n){
        StringBuilder bin=new StringBuilder();

        while(n>0){
            int bit=n%2;
            bin.append((char)('0'+bit));
            n/=2;
        }

        bin.reverse();
        return bin.toString();
    }

    //Using Head Recursion - O(log₂(n)) Time and O(log₂(n)) Space
    public void decToBinaryRec(int n,StringBuilder sb){
        if(n==0){
            return;
        }

        decToBinaryRec(n/2,sb);
        sb.append(n%2);
    }

    public String decToBinary_2(int n){
        if(n==0){
            return "0";
        }

        StringBuilder bin=new StringBuilder();
        decToBinaryRec(n,bin);
        return bin.toString();

    }

    //Using Bitwise Operators - O(log₂(n)) Time and O(log₂(n)) Space
    public String decToBinary_3(int n){
        StringBuilder bin=new StringBuilder();

        while(n>0){
            int bit=n&1;
            bin.append(bit);
            n=n>>1;
        }
        return bin.reverse().toString();
    }

    //Using Built-in Methods - O(log₂(n)) Time and O(log₂(n)) Space
    public String decToBinary_4(int n){
        int len=(int)(Math.log(n)/Math.log(2));

        return String.format("%s",Integer.toBinaryString(n));
    }
}
