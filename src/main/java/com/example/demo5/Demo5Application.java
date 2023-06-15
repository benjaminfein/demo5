package main.java.com.example.demo5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Demo5Application {
    public static void main(String[] args) {
        File firstFile = new File("src/resources/folder2/file1");
        File secondFile = new File("src/resources/folder4/file2");
        File thirdFile = new File("src/resources/folder6/file3");
        File fourthFile = new File("src/resources/folder8/file4");
        String firstPath = Paths.get("src/resources/folder2/file1").toString();
        String secondPath = Paths.get("src/resources/folder4/file2").toString();
        String thirdPath = Paths.get("src/resources/folder6/file3").toString();
        String fourthPath = Paths.get("src/resources/folder8/file4").toString();

        String[] names = new String[]{firstFile.getName(), secondFile.getName(),
                thirdFile.getName(), fourthFile.getName()};
        System.out.println(Arrays.toString(names));
        try(FileReader firstFileReader = new FileReader(firstPath)) {
            Scanner scanner = new Scanner(firstFileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(FileReader secondFileReader = new FileReader(secondPath)) {
            Scanner scanner = new Scanner(secondFileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(FileReader thirdFileReader = new FileReader(thirdPath)) {
            Scanner scanner = new Scanner(thirdFileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(FileReader fourthFileReader = new FileReader(fourthPath)) {
            Scanner scanner = new Scanner(fourthFileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
