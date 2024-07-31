package com.qa.factorial;

public class Factorial {

    private Factorial() {
    }

    public static void isFactorial(int i){
        int n =2;
        int j = i;
        while (true){
            if (j % n == 0){
                j = j / n;
                n +=1;
            }
            else{
                break;
            }
        }
        if (j != 1){
            System.out.println(i+" NONE");
            return;
        }
        System.out.println((n-1)+"! is equal to "+i);
    }
}
