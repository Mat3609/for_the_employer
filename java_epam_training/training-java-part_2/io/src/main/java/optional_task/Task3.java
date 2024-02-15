package optional_task;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File fileReader = new File("src/main/java/optional_task/Task2.java");
        File createDir = new File("src/main/java/OptionalTaskTest");
        File newFile = new File("src/main/java/OptionalTaskTest/TestTask3");


        createDir.mkdir();
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String data = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReader))){

            String buffer = "";
            while ((buffer = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(buffer);
                    data += stringBuilder.reverse().toString();
                    data += "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile))){
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
