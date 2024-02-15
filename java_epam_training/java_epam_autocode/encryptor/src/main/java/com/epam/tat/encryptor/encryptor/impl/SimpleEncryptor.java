package com.epam.tat.encryptor.encryptor.impl;

import com.epam.tat.encryptor.datasource.IDataSource;
import com.epam.tat.encryptor.encryptor.ISimpleEncryptor;

import java.util.*;

public class SimpleEncryptor implements ISimpleEncryptor {

    private IDataSource dataSource;

    public SimpleEncryptor(IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void changeLetters(char oldChar, char newChar) {
        String oldString = String.valueOf(oldChar);
        String newString = String.valueOf(newChar);
        List<String> dataList = dataSource.readData();
        dataList.remove(0);
        List<String> encoderList = new ArrayList<>();
        dataList.forEach(s -> encoderList.add(s.replaceAll(oldString, newString)));
        dataSource.writeData(encoderList);
    }

    @Override
    public void byteEncryption() {
        List<String> dataList = dataSource.readData();
        dataList.remove(0);
        String data = "";

        StringBuilder dataEncoder = new StringBuilder();
        List<String> encoderList = new ArrayList<>();
        String[] splitData;

        for (String str : dataList) {
            data = str;
            splitData = data.split(";");

            for (int i = 0; i < splitData.length; i++) {
                dataEncoder.append(Base64.getMimeEncoder().encodeToString(splitData[i].getBytes()));
                if (i < splitData.length - 1) dataEncoder.append(";");
            }
            String dataEncoderString = dataEncoder.toString();
            encoderList.add(dataEncoderString);
            dataEncoder = new StringBuilder();
        }
        dataSource.writeData(encoderList);
    }

    @Override
    public void rot1() {
        List<String> dataList = dataSource.readData();
        dataList.remove(0);

        String originalData = "";

        StringBuilder encoderData = new StringBuilder();
        List<String> encoderList = new ArrayList<>();

        for (int i = 0; i < dataList.size(); i++) {
            originalData = dataList.get(i);

            for (int j = 0; j < originalData.length(); j++) {
                char symbolOriginal = originalData.charAt(j);
                symbolOriginal ++;
                String encoderSymbol = String.valueOf(symbolOriginal);

                if (encoderSymbol.equals(":")) encoderSymbol = "0";
                if (encoderSymbol.equals("{")) encoderSymbol = "a";
                if (encoderSymbol.equals("[")) encoderSymbol = "A";

                encoderData.append(originalData.substring(j, j + 1).replaceAll("\\w", encoderSymbol));
            }
            String encoderDataString = encoderData.toString();
            encoderList.add(encoderDataString);
            encoderData = new StringBuilder();
        }
        dataSource.writeData(encoderList);
    }

}
