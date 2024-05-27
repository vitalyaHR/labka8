import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.println("Введiть номер завдання (1; 2), або 'q' для виходу:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                return;
            }

            switch (userInput) {
                case "1":
                    System.out.println("-------------------------------");
                    In task1 = new In();
                    task1.Input();
                    System.out.println("-------------------------------");
                    break;
                case "2":
                    System.out.println("-------------------------------");
                    Out task2 = new Out();
                    task2.Output();
                    System.out.println("-------------------------------");
                    break;
                default:
                    System.out.println("Неправильний ввiд. Введiть номер завдання (1; 2) або 'q' для виходу.");
                    break;
            }
        }
    }
}
