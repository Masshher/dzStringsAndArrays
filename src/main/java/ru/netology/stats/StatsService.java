package ru.netology.stats;

public class StatsService {

    public int sumSales (int[] sales) {
        int sum = 0;

        for (int t : sales) {
            sum = sum + t;
        }

        return sum;
    }

    public int averageSale (int [] sales) {
        int sum = sumSales(sales);

        int average = sum / sales.length;

        return average;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverageSales(int [] sales) {
        int averageMonth = averageSale(sales);

        int smallSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if ( sales[i] < averageMonth)
                smallSales = smallSales + 1;
        }

        return smallSales;

    }

    public int aboveAverageSales(int [] sales) {
        int averageMonth = averageSale(sales);

        int largeSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if ( sales[i] > averageMonth)

                largeSales = largeSales + 1;
        }

        return largeSales;
    }

}
