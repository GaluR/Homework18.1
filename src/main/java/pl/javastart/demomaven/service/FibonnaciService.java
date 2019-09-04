package pl.javastart.demomaven.service;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciService {

    public int sumOfFibonacci(int maximumValue) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);
        int sum = 0;
        for (int i = 1; i < fibonacciNumbers.size(); i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i - 1));
            if (fibonacciNumbers.get(i + 1) % 2 == 0) {
                sum += fibonacciNumbers.get(i + 1);
                if (fibonacciNumbers.get(i + 1) > maximumValue) {
                    sum = sum - fibonacciNumbers.get(i + 1);
                    break;
                }
            }
        }
        return sum;
    }

}
