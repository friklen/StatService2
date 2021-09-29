package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void shouldSum() {
        int[] purchases;
        purchases = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sum(purchases);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAverage() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.average();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthNumberWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.monthWithMax(purchases);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthNumberWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthWithMin(purchases);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthCountMoreAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.moreThanAverage(purchases);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthCountLessAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.lessThanAverage(purchases);
        Assertions.assertEquals(expected, actual);
    }
}