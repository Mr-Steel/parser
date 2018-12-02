package net.steel.parser;

import java.util.Optional;

public interface FileParser {

    void parseAll();

    void parseAll(String marker);
}
