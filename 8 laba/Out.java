import java.io.*;
import java.util.Scanner;

public class Out {

    public void Output() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть шлях до txt файлу:");
        String filename = scanner.nextLine();

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Помилка при читаннi з файлу: " + e.getMessage());
        }
    }
}