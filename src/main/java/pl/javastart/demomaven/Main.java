package pl.javastart.demomaven;

import pl.javastart.demomaven.pl.javastart.demomaven.service.FibonnaciService;

public class Main {
    public static void main(String[] args) {
        FibonnaciService fibonnaciService = new FibonnaciService();
        System.out.println(fibonnaciService.sumOfFibonacci(100));
    }
}
