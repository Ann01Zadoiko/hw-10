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
    private static final String ABSOLUTE_PATH = "D:\\111\\Java Core 6\\hw-10\\src\\main\\resources\\words.txt";

    private static void wordCount() throws IOException {
        File file = new File(ABSOLUTE_PATH);
        String string1 = Files.readString(Path.of(ABSOLUTE_PATH));
        String string2[]=string1.split(" ");
        List<String> list = Arrays.asList(string1.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}

