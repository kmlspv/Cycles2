public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total<=2_459_000) {
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
        for (a = 10;a >= 0;a--) {
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
        for (int year = 1;year<=10;year++) {
            populationInY = populationInY + fertilityInY - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationInY + " человек");
        }

    }
}