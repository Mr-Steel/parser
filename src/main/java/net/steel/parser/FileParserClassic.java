package net.steel.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParserClassic implements FileParser {

    @Override
    public void parseAll(String marker) {
        String fileName = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            if (marker != null && !marker.isEmpty()) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains(marker)) {
                        System.out.println(line);
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void parseAll() {
    }
}
