import com.opencsv.CSVWriter;
import models.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonCsvWriter {
    private static final String SEPARATOR = ",";

    public static void main(String[] args) {
        ArrayList<Person> dataLines = buildSampleData();
        writeUsingOpenCsv(dataLines);
    }

    private static ArrayList<Person> buildSampleData() {
        ArrayList<Person> sampleDataLines = new ArrayList<>();
        sampleDataLines.add(new Person("John Smith", "john.smith@example.com", "Ion", 30));
        sampleDataLines.add(new Person("Alice Johnson", "alice.johnson@example.com", "Maria", 25));
        sampleDataLines.add(new Person("David Lee", "david.lee@example.com", "Andrei", 35));

        return sampleDataLines;
    }


    private static void writeUsingOpenCsv(ArrayList<Person> dataLines) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("./lab8/csv_OpenCsv_output.csv"))) {
            for (Person line : dataLines) {
                writer.writeNext(new String[]{line.getName(),line.getPrenume(),line.getEmail()}, false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
