package com.epam.tat.encryptor.datasource.impl;


import com.epam.tat.encryptor.datasource.IDataSource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataSource implements IDataSource {

    private final String inputEndpoint;
    private final String outputEndpoint;

    public FileDataSource(String inputEndpoint, String outputEndpoint) {
        this.inputEndpoint = inputEndpoint;
        this.outputEndpoint = outputEndpoint;
    }

    @Override
    public void writeData(List<String> data) {
       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputEndpoint))){
           for (int i = 0; i < data.size(); i++) {
               bufferedWriter.write(data.get(i));
               bufferedWriter.newLine();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    @Override
    public List<String> readData() {
        return readData(inputEndpoint);
    }

    @Override
    public List<String> readData(String path) {
        List<String> data = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            data = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
               data.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
