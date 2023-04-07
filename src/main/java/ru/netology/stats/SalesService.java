package ru.netology.stats;

public class SalesService{

    public int sumSales(int[] sales) {
        int sum=0;
        for(int i=0; i<sales.length-1; i++){
            sum =sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
       int avg=0;
       avg = sumSales(sales)/sales.length;
       return avg;
    }

    public int maxSales(int[] sales) {
        int max=sales[0];
        int maxDay=0;
       for(int i=1; i<sales.length-1; i++) {
           if (max< sales[i]) {
               max=sales[i];
               maxDay = i;
           }
       }
        return maxDay;
    }

}

