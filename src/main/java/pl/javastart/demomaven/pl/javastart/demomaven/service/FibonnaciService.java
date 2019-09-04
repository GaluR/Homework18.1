package pl.javastart.demomaven.pl.javastart.demomaven.service;

public class FibonnaciService {

    public int sumOfFibonacci(int a) {
        int[] ints = new int[a];
        ints[0] = 1;
        ints[1] = 1;
        int sum = 0;
        for (int i = 1; i < a-1; i++) {
            ints[i + 1] = ints[i] + ints[i - 1];
            if (ints[i + 1] % 2 == 0) {
                sum += ints[i + 1];
                if (ints[i+1] > 4000000) {
                    sum = sum - ints[i + 1];
                    break;
                }
            }

        }
        return sum;
    }

}
