package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashBackHackServiceTest {

    @Test
    public void remainZero() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 600;
        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}