package com.filewriter;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static boolean exists(String path) {
        File tmp = new File(path);
        return tmp.exists();
    }

    public static File createFile(String pathToFolder, String filename, String extension) throws IOException {
        String completePath = pathToFolder + "/" + filename + "." + extension;
        File f = new File(completePath);
        if (exists(completePath)) {
            f.createNewFile();
        }
        return f;
    }

    public static void writeContent(String content, File file) throws IOException {
        FileWriter myWriter = new FileWriter(file);
        myWriter.write(content);
        myWriter.close();
    }

    public static void appendContent(File file, String content) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(content);
        bw.newLine();
        bw.close();
    }
}
