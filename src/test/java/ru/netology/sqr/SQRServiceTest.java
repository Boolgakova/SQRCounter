package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testWithDataFromFile(int expected, int down, int up) {
        SQRService number = new SQRService();
        int actual = number.counter(down, up);
        Assertions.assertEquals(expected, actual);
    }
}