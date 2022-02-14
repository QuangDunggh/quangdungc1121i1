package readFileCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileCSV {
    public static void main(String[] args) {
        Country country1 = new Country(1,"VN","Viet Nam");
        Country country2 = new Country(2,"AU","Australia");
        Country country3 = new Country(3,"CN","China");
        Country country4 = new Country(4,"JP","Japan");
        Country country5 = new Country(5,"US","United state");
        Country country6 = new Country(6,"UK","United Kingdom");
        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        File file = new File("countries.csv");
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < countries.size(); i++) {
                fw.write(  countries.get(i).toString() + "\n");

            }

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
