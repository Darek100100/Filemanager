package org.example;

import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;


public class Filemanager {
    public void listFilesManager(String directory) {
        System.out.println("te pliki masz w folderze: ");

        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)  //filtr by zostaly tylko pliki
                .map(File::getName)  //by dostawac wszystkie nazwy plików
                .forEach(System.out::println);
    }

           public void sortFilesInDirectory(String directory){
            Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                    .filter(File::isFile)
                    .sorted((o1, o2) -> Long.compare(o2.length(), o1.length()))
                    .forEach(file -> {
                        System.out.println(file.getName());
                        System.out.println(file.length());
                        System.out.println();
                    });

        }
}




