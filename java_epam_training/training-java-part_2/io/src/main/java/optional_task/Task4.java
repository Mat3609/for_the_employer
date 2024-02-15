package optional_task;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task4 {
    public static void main(String[] args) {
        File file = new File("src/main/java/main_task/WrightStructure.java");
        File newFile = new File("c:/Users/Mat3609/Desktop/File.txt");

        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String buffer = "";

            while ((buffer = bufferedReader.readLine()) != null) {
                data += buffer;
                data += "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Pattern pattern = Pattern.compile("\\w{3,}");
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()){
            String replacement = matcher.group().toUpperCase();
            data = data.replaceAll(matcher.group(), replacement);
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))){
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
