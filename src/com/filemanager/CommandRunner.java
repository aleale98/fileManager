package com.filemanager;

import java.io.IOException;

public class CommandRunner {

    public int runCommand() throws IOException {
        int exitValue = Integer.MIN_VALUE;
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "dir");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        try {
            exitValue = p.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
            p.destroy();
        }

        return exitValue;
    }
}
