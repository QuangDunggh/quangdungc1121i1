package readFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFIleCSV {
    public static void main(String[] args) {

        File file = new File("countries.csv");
        try {
            BufferedReader fr = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fr.readLine()) != null) {
                printCountry(parseCountry(line));
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseCountry(String csvLine) {
        List<String> countries = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                countries.add(splitData[i]);
            }
        }
        return countries;
    }

    public static void printCountry(List<String> country) {
        System.out.println(country.get(0) + country.get(1) + country.get(2)
        );
    }
}
