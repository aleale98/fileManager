package com;

import com.filemanager.CommandRunner;
import com.filewriter.Writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "dir");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        while ((line = r.readLine()) != null) {
            System.out.println(line);
        }
        builder = new ProcessBuilder("cmd.exe", "/c", "mkdir prova");
        p = builder.start();
        r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        builder = new ProcessBuilder(
                "cmd.exe", "/c", "dir");
        builder.redirectErrorStream(true);
        p = builder.start();
        r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        line = "";
        while ((line = r.readLine()) != null) {
            line = r.readLine();
            System.out.println(line);
        }
        p.destroy();
         */
        //CommandRunner c = new CommandRunner();
        System.out.println(Writer.exists("src/com/filewriter/Writer.java"));
        File file = Writer.createFile("src/com/filewriter", "test", "txt");
        Writer.writeContent("Files in Java might be tricky, but it is fun enough!", file);
        for(int i = 0; i < 10; i++){
            Writer.appendContent(file, ""+i);
        }
    }

}
