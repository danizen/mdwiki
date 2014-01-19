package org.mdwiki;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.Files;
import java.nio.file.FileVisitResult;

public class Indexer extends SimpleFileVisitor<Path> {

    protected Config config;

    public Indexer(Config _config) {
        config = _config;
    }

    public void scan() {
        v = new SimpleFileVisitor<Path> {
            FileVisitResult visitfile(Path f, BasicFileAttributes a) throws IOException {
                System.out.println(f.toString);
            }
        };
        Files.walkFileTree(config.home, v);
    }
}

