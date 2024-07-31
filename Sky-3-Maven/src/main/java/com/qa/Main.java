package com.qa;

import com.qa.calc.Calculator;
import com.qa.factorial.Factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println(Calculator.add(1,2));

        Factorial.isFactorial(3);
    }
}