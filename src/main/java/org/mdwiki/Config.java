package org.mdwiki;

import java.nio.Path;
import java.nio.FileSystems;

public class Config {

    protected Path home;

    public Config (String path) {
        home = FileSystems.getDefault().getPath(path);
    }

    public Path getHome() {
        return home;
    }
}

