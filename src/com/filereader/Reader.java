package com.filereader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reader {
    public static String getFileContent(File file) throws IOException {
        String content = Files.readString(Path.of(file.getPath()));
        return content;
    }
}
