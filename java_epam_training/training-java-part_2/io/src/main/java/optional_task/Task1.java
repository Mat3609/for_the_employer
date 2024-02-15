package optional_task;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File createDir = new File("homework");
        createDir.mkdir();

        File newFile = new  File(createDir + File.separator + "trr");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileWriter writer = new FileWriter(newFile)){
            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 10);
                writer.write(String.valueOf(random));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        char[] chars = new char[0];
        try (FileReader reader = new FileReader(newFile)){
            int[] ints = new int[10];
            chars = new char[10];
            reader.read(chars);

            for (int i = 0; i < 10; i++) {
                ints[i] = (int) chars[i];
            }

            Arrays.sort(ints);

            for (int i = 0; i < 10; i++) {
                chars[i] = (char) ints[i];
            }

            System.out.println(Arrays.toString(chars));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileWriter writer = new FileWriter(newFile)){
            writer.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
