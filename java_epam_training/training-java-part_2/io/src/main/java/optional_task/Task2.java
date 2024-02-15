package optional_task;

import java.io.*;


public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/OptionalTask2Test.java");
        File file1 = new File("src/main/java/OptionalTask2Test.java");

        String data = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                data += str;
                data += "\n";
            }
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        data = data.replaceAll("public", "private");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1))){
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
