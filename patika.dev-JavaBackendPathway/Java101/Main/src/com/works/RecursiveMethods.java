package com.works;

public class RecursiveMethods {
    public static void main(String[] args) {
        System.out.print(f(4));
    }

    static int f(int n){
        if (n == 1){
            return 1;
        }
        return f(n-1) + n;
    }
/*
    static int f(int x){
        int res = 0;
        for (int i = 1; i <= x; i++){
            res += i;
        }
        return res;
    }
*/
}
