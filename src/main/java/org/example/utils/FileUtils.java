package org.example.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> getPictures(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        List<String> filePath = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                filePath.add(file.getAbsolutePath());
            }
        }
        return filePath;
    }
}
