import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WC {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: java Wc <filename>");
      return;
    }

    String fileName = args[0];

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      int lines = 0, words = 0, characters = 0;
      String line;

      while ((line = reader.readLine()) != null) {
        lines++;
        characters += line.length();
        words += line.split("\\s+").length;
      }

      System.out.println("Lines: " + lines);
      System.out.println("Words: " + words);
      System.out.println("Characters: " + characters);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}
