import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileHandler {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Soman\\IdeaProjects\\CSV Files\\src\\CSVDemo.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);

                for (String value : values) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}