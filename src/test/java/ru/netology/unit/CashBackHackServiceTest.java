package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void buyMore() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}