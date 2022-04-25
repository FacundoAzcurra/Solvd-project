package com.solvd.airportpackage.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArticleSort {
    public static void main(String[] args) throws IOException {

        File article = new File("src/main/resources/article.txt");
        FileUtils.write(new File("src/main/resources/sortedArticle.txt"), parser(article), "UTF-8");
    }

    private static String parser(File file) throws IOException {
        Map<String, Integer> sortedWords = new HashMap<>();
        String text = FileUtils.readFileToString(file, "UTF-8").toLowerCase();
        Arrays.stream(StringUtils.split(text, " ,.;:!?-_()/\"\r\n\uFEFF")).forEach((word) -> {
            if (sortedWords.containsKey(word)) sortedWords.replace(word, sortedWords.get(word) + 1);
            else sortedWords.put(word, 1);
        });
        text = "";
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            String word = entry.getKey();
            Integer number = entry.getValue();
            text = text + word + "-" + number + "\n";
        }
        return text;
    }
}
