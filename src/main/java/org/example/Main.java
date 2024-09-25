package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваше имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите ваш личный код: ");
        String personalCode = scanner.nextLine();

        String birthDate = extractBirthDate(personalCode);

        System.out.println(firstName + " " + lastName + " родился " + birthDate + ".");
    }

    private static String extractBirthDate(String personalCode) {

        int century = (personalCode.charAt(0) == '3' || personalCode.charAt(0) == '4') ? 1900 : 2000;
        int year = century + Integer.parseInt(personalCode.substring(1, 3));
        int month = Integer.parseInt(personalCode.substring(3, 5));
        int day = Integer.parseInt(personalCode.substring(5, 7));

        String[] months = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        String monthStr = months[month - 1];

        return day + " " + monthStr + " " + year + " года";
    }
}

