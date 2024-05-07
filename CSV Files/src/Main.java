import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {

        List<String> list=Files.readAllLines(Paths.get("C:\\Users\\Soman\\IdeaProjects\\CSV Files\\src\\Students.txt"));

        for(String temp:list)
            System.out.println(temp);

    }
}

