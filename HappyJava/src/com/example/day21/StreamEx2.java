package com.example.day21;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.*;

public class StreamEx2 {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("src/com/example");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
        stream.close();

        Stream<String> strea2 = Files.lines(Paths.get("src/com/example/StackHeap.java"));
        strea2.forEach(System.out::println);

    }
}
