package main_task;


import java.io.File;

//Запускать через командную строку передовая в качестве аргумента путь к директории
public class Main {
    public static void main(String[] args) {
        String readPath = args[0].toString();

        System.out.println(readPath);
        File filePath = new File(readPath);
        WrightStructure wrightStructure = new WrightStructure();
        System.out.println(wrightStructure.printDirectoryTree(filePath));
    }
}
