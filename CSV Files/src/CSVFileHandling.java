import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CSVFileHandling {
    public static void main(String[] args) {
        String CSVFile = "C:\\Users\\Soman\\IdeaProjects\\CSV Files\\src\\CSVDemo.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CSVFile))){
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                for (String value : values) {
                    System.out.println(value+ "\t");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
