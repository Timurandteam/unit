package ru.netology.service;


import org.junit.Assert;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldAddIfAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));
    }

    @org.junit.Test
    public void shouldAddIfAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(900, service.remain(1100));
    }

    @org.junit.Test
    public void shouldReturn0IfAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }
}