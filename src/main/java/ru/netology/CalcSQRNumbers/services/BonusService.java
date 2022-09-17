package ru.netology.CalcSQRNumbers.services;

public class BonusService {

    public int calcSqrs(int initialNumber, int finitNumber) {
        int cont = 0;
        int start = initialNumber;
        int end = finitNumber;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start && i * i <= finitNumber) {
                cont++;
            }
        }
        return cont;
    }
}