
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Exercise2 {
     private static final String ABSOLUTE_PATH = "D:\\111\\Java Core 6\\hw-10\\src\\main\\resources\\file_2.txt";

     public static void main(String[] args) throws IOException {
             User[] people = readFile(ABSOLUTE_PATH);
             Writer writer = new FileWriter("user2.json");
             Gson gson = new GsonBuilder().setPrettyPrinting().create();
             User [] users = new User[people.length-1];
             System.arraycopy(people,1,users,0,users.length);
             gson.toJson(users, writer);
             writer.close();
     }

     public static User[] readFile(String filename) throws IOException {
         List<String> stringList = Files.readAllLines(Paths.get(ABSOLUTE_PATH));
         User [] list = new User[stringList.size()];
         int count = 0;
         File file = new File(ABSOLUTE_PATH);
         Scanner scanner = new Scanner(file);
             if (file.canRead()) {
                 while (scanner.hasNext()) {
                     String name = scanner.next();
                     String age = scanner.next();
                     list[count] = new User(name, age);
                     count++;
                 }
             }
         return list;
     }
 }

class User implements Serializable {
     private String name;
    private String age;


    public User() {
        this.setAge("");
        this.setName("");
    }

    public User(String name, String age){
        this.setName(name);
        this.setAge(age);
    }



    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}


