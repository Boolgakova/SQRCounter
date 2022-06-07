package ru.netology.sqr;

public class SQRService {
    public int counter(int down, int up) {
        int square;
        int count = 0;
        int result = count;
        for (int i = 10; i <= 99; i++) {
            square = i * i;
            if (square >= down && square <= up) {
                result = count++;
                continue;
            }
            if (square > up) {
                result = count++;
                break;
            }
        }
        return result;
    }
}
