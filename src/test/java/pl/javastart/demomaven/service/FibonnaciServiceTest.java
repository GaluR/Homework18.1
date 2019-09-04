package pl.javastart.demomaven.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonnaciServiceTest {
    FibonnaciService fibonnaciService = new FibonnaciService();

    @Test
    void forMaxValue10_shouldBe10() {
        int maxValue = 10;
        int expectedResult = 10;

        int result = fibonnaciService.sumOfFibonacci(maxValue);

        assertEquals(expectedResult, result);
    }

    @Test
    void forMaxValue5_shouldBe2() {
        int maxValue = 5;
        int expectedResult = 2;

        int result = fibonnaciService.sumOfFibonacci(maxValue);

        assertEquals(expectedResult, result);
    }

    @Test
    void forMaxValue100_shouldBe44() {
        int maxValue = 100;
        int expectedResult = 44;

        int result = fibonnaciService.sumOfFibonacci(maxValue);

        assertEquals(expectedResult, result);
    }
}