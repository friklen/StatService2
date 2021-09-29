package ru.netology.stats;

class StatsService {

    int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }

    int monthWithMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        int mountNumber = 0;
        int monthWithMax = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == max) {
                monthWithMax = mountNumber;
            }
        }
        return monthWithMax;
    }


    int monthWithMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        int mountNumber = 0;
        int monthWithMin = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == min) {
                monthWithMin = mountNumber;
            }
        }
        return monthWithMin;
    }

    int moreThanAverage(int[] purchases) {
        int average = average();
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }


    int lessThanAverage(int[] purchases) {
        int average = average();
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }

    public int average() {
        return 0;
    }
}