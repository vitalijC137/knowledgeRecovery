package com.workWithFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterFileReaderExploration {

    public void executive() throws Exception {
        writeText();
        readText();
    }

    public void writeText() throws Exception {

        FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.write("1111\n2222\n3333\n4444");
        fileWriter.close();

    }

    public void readText() throws Exception {
        FileReader fileReader = new FileReader("file.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
