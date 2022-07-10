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
        File file = new File(PATH);
        Scanner scanner = new Scanner(file);
        List<String> list = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<String>(list);
        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            list.addAll(List.of(array));
        }
        Set<String> unique = new HashSet<String>(list);
        for (String word : unique) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
        scanner.close();
    }
}

