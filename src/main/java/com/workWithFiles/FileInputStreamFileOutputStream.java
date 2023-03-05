package com.workWithFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStream {

    public void executive() throws IOException {

        fileInputStreamFileOutputStreamMethod();
        fileInputStreamFileOutputStreamMethod2();

    }

    public void fileInputStreamFileOutputStreamMethod() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:/it/currentProjects/study/inputTextFile.txt");
        FileOutputStream outputStream = new FileOutputStream("D:/it/currentProjects/study/outputTextFile.txt");
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }

    public void fileInputStreamFileOutputStreamMethod2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/it/currentProjects/study/inputTextFile2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:/it/currentProjects/study/outputTextFile2.txt");
        byte[] data = new byte[1000];
        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(data);
            fileOutputStream.write(data, 0, count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
