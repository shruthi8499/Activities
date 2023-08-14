package com.mystream;
import java.util.stream.*;
import java.util.function.Supplier;
public class PrimeNumbers {
    public static void main(String[] args) {
        Stream<Integer> primeStream = Stream.generate(new PrimeNumberSupplier()).limit(10);
        primeStream.forEach(System.out::println);
    }
}
class PrimeNumberSupplier implements Supplier<Integer> {
    private int cur= 2;
    public Integer get() {
        int num = cur;
        while (!isPrime(num)) {
            num++;
        }
        cur= num + 1;
        return num;
    }
    private boolean isPrime(int n) {
        if (n<=1) return false;
        if (n<=3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i+=6) {
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }}
