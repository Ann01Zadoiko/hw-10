import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    private static String PATH = ".\\src\\main\\resources\\file.txt";

    public static void printValidNum(File file) {
        if (!file.exists()) {
            throw new RuntimeException("File with name " + file.getName() + " not exist");
        }

        try {
            List content = Files.readAllLines(Paths.get(PATH), StandardCharsets.UTF_8);
            Pattern pattern1 = Pattern.compile("^((\\()([0-9]{3})(\\) )([0-9]{3})(-)([0-9]){4})$");
            Pattern pattern2 = Pattern.compile("^(([0-9]{3})(-)([0-9]{3})(-)([0-9]){4})$");

            for (int i = 0; i < content.size(); i++) {
                Matcher matcher1 = pattern1.matcher((CharSequence) content.get(i));
                Matcher matcher2 = pattern2.matcher((CharSequence) content.get(i));

                if (matcher1.matches()){
                    System.out.println(content.get(i));
                }

                if (matcher2.matches()){
                    System.out.println(content.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
