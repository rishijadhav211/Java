package org.example;

public class Factorial {

    public int findFactorial(int num){
        if(num<=1){
            return 1;
        }
        return num*findFactorial(num-1);
    }
}
