package com.workWithFiles;

import java.io.File;
import java.io.IOException;

public class FileExploration {

    boolean indicator;
    boolean isFileCreated;

    long totalSpace;
    long freeSpace;
    long usableSpace;

    File directory = new File("D:/it/currentProjects/study");
    File file = new File(directory, "IOFile.txt");
    File fileNewName = new File(directory, "IOFile2.txt");
    File disc = new File("D:/");
    File makeDirectory = new File("D:/it/currentProjects/study/newDirectory");
    File makeDirectories = new File("D:/directory1/directory2/directory3");

    public void executive() throws IOException {
        creator();
    }

    public void creator() throws IOException {
        indicator = file.exists();
        if (!indicator) {
            isFileCreated = file.createNewFile();
            System.out.println("file is created:" + isFileCreated);
        }

        System.out.println("file.exists():" + file.exists() + "\n" + "directory.exists():" + directory.exists() + "\n");
        System.out.println("file.getName(): " + file.getName() + "\n" + "directory.getName(): " + directory.getName() + "\n");
        System.out.println("file.canRead(): " + file.canRead() + "\n" + "directory.canRead(): " + directory.canRead());
        System.out.println("file.canWrite(): " + file.canWrite() + "\n" + "directory.canWrite(): " + directory.canWrite() + "\n");
        System.out.println("file.isAbsolute(): " + file.isAbsolute() + "\n" + "directory.isAbsolute: " + directory.isAbsolute() + "\n");
        System.out.println("file.getAbsolutePath():" + file.getAbsolutePath() + "\n" + "directory.getAbsolutePath():" + directory.getAbsolutePath() + "\n");
        System.out.println("file.getPath():" + file.getPath() + "\n" + "directory.getPath():" + directory.getPath() + "\n");
        System.out.println("file.isFile():" + file.isFile() + "\n" + "directory.isFile():" + directory.isFile());
        System.out.println("file.isDirectory():" + file.isDirectory() + "\n" +"directory.isDirectory():" + directory.isDirectory() + "\n");
        System.out.println("file.isHidden():" + file.isHidden() + "\n" + "directory.isHidden():" + directory.isHidden() + "\n");
        System.out.println("file.length():" + file.length() + "\n" + "directory.length():" + directory.length() + "\n");

        // System.out.println("file.renameTo(fileNewName): " + file.renameTo(fileNewName) + "\n");

        totalSpace = disc.getTotalSpace();
        freeSpace = disc.getFreeSpace();
        usableSpace = disc.getUsableSpace();
        System.out.println("bites - " + "totalSpace: " + totalSpace + "\nfreeSpace: " + freeSpace + "\nusableSpace: " + usableSpace + "\n");
        System.out.println("kb - " + "totalSpace: " + (totalSpace /= 1024) + "\nfreeSpace: " + (freeSpace /= 1024) + "\nusableSpace: " + (usableSpace /= 1024) + "\n");
        System.out.println("mb - " + "totalSpace: " + (totalSpace /= 1024) + "\nfreeSpace: " + (freeSpace /= 1024) + "\nusableSpace: " + (usableSpace /= 1024) + "\n");
        System.out.println("gb - " + "totalSpace: " + (totalSpace /= 1024) + "\nfreeSpace: " + (freeSpace /= 1024) + "\nusableSpace: " + (usableSpace /= 1024) + "\n");

        System.out.println("makeDirectory.mkdir():" + makeDirectory.mkdir());
        System.out.println("mareDirectories.mkdirs():" + makeDirectories.mkdirs());

        // System.out.println("file.delete():" + file.delete());
        // System.out.println("directory.delete():" + directory.delete());

    }
}
