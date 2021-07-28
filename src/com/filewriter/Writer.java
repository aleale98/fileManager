package com.filewriter;

import org.jetbrains.annotations.NotNull;

import java.io.*;

public class Writer {

    public static boolean exists(String path) {
        File tmp = new File(path);
        return tmp.exists();
    }

    public static File createFile(String pathToFolder, String filename, String extension) throws IOException {
        String completePath = pathToFolder + "/" + filename + "." + extension;
        File f = new File(completePath);
        f.createNewFile();
        return f;
    }

    public static void writeContent(String content, File file) throws IOException {
            FileWriter myWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
    }

    public static void appendContent(File file, String content) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(content);
        bw.newLine();
        bw.close();
    }

    public static void resetFile(File file) throws IOException {
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }
}
