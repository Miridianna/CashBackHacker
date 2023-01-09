package ru.netology.unit;

public class Main {
    public static void main(String[] args) {
        BonusService servise = new BonusService();
        int result = servise.calculateBonus(1_000);
        System.out.println(result);
    }
}
