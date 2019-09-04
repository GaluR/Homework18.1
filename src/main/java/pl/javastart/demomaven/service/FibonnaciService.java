package pl.javastart.demomaven.service;

public class FibonnaciService {

    public int sumOfFibonacci(int maximumValue) {
        int[] fibonacciNumbers = new int[100];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        int sum = 0;
        for (int i = 1; i < fibonacciNumbers.length-1; i++) {
            fibonacciNumbers[i + 1] = fibonacciNumbers[i] + fibonacciNumbers[i - 1];
            if (fibonacciNumbers[i + 1] % 2 == 0) {
                sum += fibonacciNumbers[i + 1];
                if (fibonacciNumbers[i+1] > maximumValue) {
                    sum = sum - fibonacciNumbers[i + 1];
                    break;
                }
            }

        }
        return sum;
    }

}
