package Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Запись в  файл введенной информации");
        try (FileWriter fw= new FileWriter("newtext.txt",false)) {
            Scanner sc=new Scanner(System.in);
            fw.write(sc.nextLine());
            fw.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Вывод инфомации из файла");
        try (FileReader fr=new FileReader("newtext.txt")) {
            Scanner scan = new Scanner(fr);
            System.out.println(scan.nextLine());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Замена информации из файла");
        try (FileWriter fw= new FileWriter("newtext.txt",false)) {
            Scanner sc=new Scanner(System.in);
            fw.write(sc.nextLine());
            fw.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Добавление текста в конец исходного файла");
        try (FileWriter fw= new FileWriter("newtext.txt",true)) {
            Scanner sc=new Scanner(System.in);
            fw.write("\n"+sc.nextLine());
            fw.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
