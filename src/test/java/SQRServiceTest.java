package ru.netology.CalcSQRNumbers.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.CalcSQRNumbers.services.SQRService;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int initialNumber = 200;
        int finitNumber = 300;
        int expected = 3;

        int actual = service.calcSqrs(initialNumber, finitNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        SQRService service = new SQRService();

        int initialNumber = -300;
        int finitNumber = 300;
        int expected = 8;

        int actual = service.calcSqrs(initialNumber, finitNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        SQRService service = new SQRService();

        int initialNumber = 200;
        int finitNumber = -300;
        int expected = 0;

        int actual = service.calcSqrs(initialNumber, finitNumber);

        Assertions.assertEquals(expected, actual);
    }
}