import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
    private static final String PATH = ".\\src\\main\\resources\\words.txt";

    private static void wordCount() throws IOException {
        String string1 = Files.readString(Path.of(PATH)).replace("\n", " ");

        List<String> list = Arrays.asList(string1.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

    }

    public static void main(String[] args) throws IOException {
        wordCount();
    }
}

