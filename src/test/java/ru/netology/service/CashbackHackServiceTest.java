package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldAddIfAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldAddIfAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1100), 900);
    }

    @Test
    public void shouldReturn0IfAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }
}