package com.filewriter;

import org.jetbrains.annotations.NotNull;

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
        f.createNewFile();
        return f;
    }

    public static boolean writeContent(String content, File file){
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }
}
