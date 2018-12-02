package net.steel.parser;

public class AnnotationReader {

    public static void main(String[] args) {
        FileParser fileParser = new FileParserClassic();
        fileParser.parseAll("@");
    }

}
