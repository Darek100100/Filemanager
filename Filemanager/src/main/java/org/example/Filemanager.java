package org.example;

import java.io.File;
import java.rmi.server.UnicastRemoteObject;
import java.util.Objects;
import java.util.stream.Stream;

import static sun.util.locale.LocaleMatcher.filter;

public class Filemanager {
    public void listFilesManager(String directiory){
        Stream.of(Objects.requireNonNull(new File(directiory).listFiles()))
                .filter(File::isFile)  //filtr by zostaly tylko pliki
                .map(File::getName)  //by dostawac wszystkie nazwy plików
                .forEach(System.out::println);


    }
}
