package com.andrii;

import java.util.Arrays;

public class Main {


    private static long fibSimple(int n){
        if (n <= 1)
            return n;

        return fibSimple(n - 1) + fibSimple(n - 2);
    }

    private static long fibMemorization(int n, long[] mem){
        if(mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long result =  fibMemorization(n - 1, mem) + fibMemorization(n - 2, mem);
        mem[n] = result;

        return result;
    }

    private static long fibUpgrade(int n){
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }

    public static void main(String[] args) {
	// write your code here
        int n = 100;
        long[] mem = new long[n + 1];

        Arrays.fill(mem , -1);

        System.out.println(fibSimple(10));
        System.out.println(fibMemorization(n, mem));
        System.out.println(fibUpgrade(n));
    }
}
