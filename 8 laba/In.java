import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class In {

    public void Input() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть шлях до txt файлу:");
        String filename = scanner.nextLine();

        System.out.println("Введiть дiапазон чисел (наприклад, 1 100):");
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();

        try {
            File file = new File(filename);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);

            Random random = new Random();
            for (int i = 0; i < 10; i++) { 
                int randomNumber = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNumber + " ");
            }

            writer.close();
            
            System.out.println("Послiдовнiсть випадкових чисел була успiшно записана в файл " + filename);
        } catch (IOException e) {
            System.out.println("Помилка при записi у файл: " + e.getMessage());
        } 
    }
}