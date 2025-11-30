package org.example;

import org.example.GeekForGeek.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static CheckEvenOrOdd checkEvenOrOdd = new CheckEvenOrOdd();
    private static MultiplicationTable multiplicationTable = new MultiplicationTable();
    private static Sum sum = new Sum();
    private static SumOfSquare sumOfSquare = new SumOfSquare();
    private static SwapNumber swapNumber = new SwapNumber();
    private static ClosestNumber closestNumber = new ClosestNumber();
    private static DiceProblem diceProblem = new DiceProblem();
    private static CheckNTerm checkNTerm = new CheckNTerm();
    private static SumOfDigits  sumOfDigits = new SumOfDigits();
    private static ReverserNumber reverserNumber = new ReverserNumber();
    private static CheckPrime checkPrime = new CheckPrime();
    private static CheckPower checkPower = new CheckPower();
    private static DistanceTwoPoints distanceTwoPoints = new DistanceTwoPoints();
    private static ValidTriangle validTriangle = new ValidTriangle();
    private static RectangleOverlap rectangleOverlap = new RectangleOverlap();
    private static FactorialNumber factorialNumber = new FactorialNumber();
    private static PairCubeCount pairCubeCount = new PairCubeCount();
    private static GCD gcd = new GCD();
    private static LCM lcm = new LCM();
    private static PerfectNumber  perfectNumber = new PerfectNumber();
    private static FractionNumber   fractionNumber = new FractionNumber();
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(15);
        List<Integer> ans = fractionNumber.addFraction(a,b);
        System.out.println(ans.get(0)+", "+ans.get(1));

    }
}