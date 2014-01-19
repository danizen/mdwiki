package org.mdwiki;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        String path = null;
        if (args.length == 1) {
            path = args[0];
        } else {
            path = System.getenv("MDWIKI");
        } 
        if (path == null) {
            System.err.println("Markdown Wiki location unknown:\n");
            System.err.println("Either do this:\n");
            System.err.println("    mdwiki <path>\n");
            System.err.println("or this:\n");
            System.err.println("    export MDWIKI=<path>\n");
            System.err.println("    mdwiki\n");
            System.exit(1);
        }
        Config config = new Config(path);
        Indexer indexer = new Indexer(config);
        indexer.scan();
    }
}
