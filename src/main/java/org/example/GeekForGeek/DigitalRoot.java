package org.example.GeekForGeek;

public class DigitalRoot {
    public int checkDigit(String n){
        int number=Integer.parseInt(n);

        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }

        int temp=0;
        while(sum!=0){
            temp+=sum%10;
            sum/=10;
        }
        return temp;
    }
}
