package ru.netology.stats;

public class SalesService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int avg = 0;
        avg = sumSales(sales) / sales.length;
        return avg;
    }

    public int maxSales(int[] sales) {
        int max = sales[0];
        int maxDay = 0;
        for (int i = 1; i < sales.length; i++) {
            if (max < sales[i]) {
                max = sales[i];
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int minSales(int[] sales) {
        int min = sales[0];
        int minDay = 0;
        for (int i = 1; i < sales.length; i++) {
            if (min > sales[i]) {
                min = sales[i];
                minDay = i;
            }
        }
        return minDay;
    }

    public int sumLowAverage(int[] sales) {
        int avg = averageSales(sales);
        int lowMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                lowMonths++;
            }
        }
        return lowMonths;
    }

    public int sumHighAverage(int[] sales) {
        int avg = averageSales(sales);
        int highMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                highMonths++;
            }
        }
        return highMonths;
    }
}
