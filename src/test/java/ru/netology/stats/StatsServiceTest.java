package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TestSumAllSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.SumAllSales(allSales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSalesAmount(allSales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMaxSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(allSales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMinSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(allSales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMinMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(allSales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMaxMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(allSales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}
