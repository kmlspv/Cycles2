import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            i++;
        }

        // Задача 2
        System.out.println("Задача 2");
        int a = 0;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("");
        for (a = 10; a >= 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println("");

        // Задача 3
        System.out.println("Задача 3");
        int population = 1000;
        int mortality = 8;
        int fertility = 17;
        int populationInY = 27_000_000;
        int fertilityInY = fertility * populationInY / population;
        for (int year = 1; year <= 10; year++) {
            populationInY = populationInY + fertilityInY - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationInY + " человек");
        }

        // Задача 2.1
        System.out.println("Задача 2.1");
        int accumulation = 15000;
        double profit = 0;
        double monthDepositPercentage = 0.6;
        int b = 0;
        for (; profit < 12_000_000; b++) {
            profit = (profit * monthDepositPercentage / 100) + profit;
            profit = profit + accumulation;
            System.out.println("Месяц " + b + " Итого " + profit);
        }

        // Задача 2.2
        System.out.println("Задача 2.2");
        int deposit = 15000;
        double income = 0;
        double monthPercentage = 0.6;
        int с = 0;
        for (; income < 12_000_000; с++) {
            income = (income * monthPercentage / 100) + income;
            income = income + deposit;
            if (с % 6 == 0) {
                System.out.println("Месяц " + с + " Итого " + income + " рублей");
            }
        }

        // Задача 2.3
        System.out.println("Задача 2.3");
        int contribution = 15000;
        double earnings = 0;
        double monthlyInterest = 0.6;
        int time = 1;
        for (; time <= 9 * 12; time++) {
            earnings = (earnings * monthlyInterest / 100) + earnings;
            earnings = earnings + contribution;
            if (time % 6 == 0) {
                System.out.println("Месяц " + time + " Итого " + earnings + " рублей");
            }

        }

        // Задача 2.4
        System.out.println("Задача 2.4");
        int firstFriday = 5;
        for (int day = firstFriday; day >= 31; day += 7) {
            System.out.printf("Сегодня пятница, %s. Необходимо подготовить отчет \n", day);
        }

        // Задача 3.1
        System.out.println("Задача 3.1");
        int year = 0;
        int nowYear = 2022;
        int startYear = nowYear - 200;
        int finishYaer = nowYear + 100;
        int period = 79;
        while (year <= finishYaer) {
            if (year >= startYear) {
                System.out.println(year);
            }
            year += period;
        }


        // Задача 3.2
        System.out.println("Задача 3.2");
        int N = 2;
        for (i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }

    }
}
