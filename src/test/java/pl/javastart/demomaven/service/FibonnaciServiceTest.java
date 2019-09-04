package pl.javastart.demomaven.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.javastart.demomaven.pl.javastart.demomaven.service.FibonnaciService;

import static org.junit.jupiter.api.Assertions.*;

class FibonnaciServiceTest {
    FibonnaciService fibonnaciService = new FibonnaciService();

    @Test
    void forTenFirstNumbers_shouldBe44() {
        int numbers = 10;
        int expectedResult = 44;

        int result = fibonnaciService.sumOfFibonacci(numbers);

        assertEquals(result, expectedResult);
    }

    @Test
    void forFiveFirstNumbers_shouldBe10() {
        int numbers = 4;
        int expectedResult = 2;

        int result = fibonnaciService.sumOfFibonacci(numbers);

        assertEquals(result, expectedResult);
    }

    @Test
    void forSevenFirstNumbers_shouldBe10() {
        int numbers = 7;
        int expectedResult = 10;

        int result = fibonnaciService.sumOfFibonacci(numbers);

        assertEquals(result, expectedResult);
    }
}