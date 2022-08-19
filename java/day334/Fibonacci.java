package day334;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(Arrays.toString(mem));
        System.out.println(fibNaitiv(n, mem));
    }

    private static long fibNaitiv(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1)
            return n;
        long result = fibNaitiv(n - 1, mem) + fibNaitiv(n - 2, mem);
        mem[n] =result;
        return result;
    }
}
