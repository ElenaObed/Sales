package ru.netology.stats;

// общая сумма продаж
public class StatsService {
    public int SumAllSales(int[] allSales) {
        int summSales = 0;
        for (int i : allSales) {
            summSales = summSales + i;
        }
        return summSales;
    }

    // средняя сумма продаж
    public int averageSalesAmount(int[] allSales) {
        int averageSales = SumAllSales(allSales) / allSales.length;

        return averageSales;
    }

    // пик продаж
    public int maxSales(int[] allSales) {
        int maxDay = 0;
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] >= allSales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay + 1;
    }
    // мин значение

    public int minSales(int[] allSales) {
        int minDay = 0;
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] <= allSales[minDay]) {
                minDay = i;
            }
        }
        return minDay + 1;
    }

    // мин среднего
    public int minMonth(int[] allSales) {
        int monthMin = 0;
        int averageSale = averageSalesAmount(allSales);
        for (int i : allSales) {
            if (i < averageSale) {
                monthMin++;

            }
        }
        return monthMin;
    }

    // мах среднего
    public int maxMonth(int[] allSales) {
        int monthMax = 0;
        int averageSale = averageSalesAmount(allSales);
        for (int i : allSales) {
            if (i > averageSale) {
                monthMax++;

            }
        }
        return monthMax;

    }
}
