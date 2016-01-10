package edu.csula.cs454.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A simple file read example with simple file count
 */
public class FileRead {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (
            Stream<String> stream = Files.lines(
                Paths.get(
                    ClassLoader.getSystemResource("example/alice-in-the-wonderland.txt")
                        .toURI()
                )
            )
        ) {
            list = stream
                .collect(Collectors.toList());

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }
}
