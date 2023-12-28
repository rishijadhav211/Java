package org.example;

public class Factorial {

    public int find(int num) {
        if(num<=1){
            return 1;
        }

        return num * find(num-1);
    }
}
