package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringsArray = scanner.nextLine().split(" ");
        String[] stringsArray1 = scanner.nextLine().split(" ");
        String[] stringsArray2 = scanner.nextLine().split(" ");

        File file = new File("", "array.txt");

        SaveAsThread thread = new SaveAsThread(stringsArray, file);
        thread.run();
        SaveAsThread thread1 = new SaveAsThread(stringsArray1, file);
        thread1.run();
        SaveAsThread thread2 = new SaveAsThread(stringsArray2, file);
        thread2.run();
    }
}
