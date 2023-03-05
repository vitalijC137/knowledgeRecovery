package com.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsExploration {

    public void executive() {
        tryCatchModuleExploring();
        tryCatchFinallyModuleExploration();
        // throwsKeyWordExploring();
    }

    public void tryCatchModuleExploring() {
        try {
            FileWriter fileWriter = new FileWriter("file2.txt");
            fileWriter.close();
            fileWriter.write("wrong sequence");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void tryCatchFinallyModuleExploration() {
        try {
            FileWriter fileWriter = new FileWriter("file3.txt");
            fileWriter.write("correct sequence");
            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println("Don't error - stream is open");
        }
        finally {
            System.out.println("i'm always work");
        }
        System.out.println("i'm still working");
    }

    public void throwsKeyWordExploring() throws IOException{
        FileWriter fileWriter = new FileWriter("file4.txt");
        fileWriter.close();
        fileWriter.write("trows keyword exploring");

    }

}


