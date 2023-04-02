package com.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputHandler {
  public static String readInputFromFile(String pathToFile) {
    try {
      return new String(Files.readAllBytes(Paths.get(pathToFile)));
    } catch (IOException ex) {
      System.out.println("Unable to read file.");
      System.out.println(ex.toString());
    }

    return null;
  }
}
