import java.time.LocalDate;

public class Main {

    // Task1

    public static void lipYearCount(int year) {
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является Високосным");
        } else {
            System.out.println(year + " год не является Високосным");
        }
    }

    //Task2

    public static void deviceTune(int year, int os) {
        if (year < 2015 && os == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (year < 2015 && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year >= 2015 && os == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (year >= 2015 && os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    //Task3

    public static void daysCount(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {

        //Task1

        lipYearCount(2019);

        //Task2

        int currentYear = 2004;
        int phoneOS = 0;

        deviceTune(currentYear, phoneOS);

        //Task3

        daysCount(120);


    }

}


