package MainPackage;

import MiscPackage.Country;
import ParserPackage.JsonParse;

import java.nio.file.Paths;

public class main {
    public static void main(String[] args) throws Exception {

        String file = "countries.json";
        System.out.println(Paths.get(file).toAbsolutePath());
        //System.out.println(JsonParse.readFileAsString("C:/Users/PC/Documents/GitHub/Final/EECS3311DDIS/src/main/java/analysis/countries.json"));
        try{
            Country[] countries = JsonParse.parse("C:/Users/PC/Documents/GitHub/Final/EECS3311DDIS/src/main/java/analysis/countries.json");
            for(Country country: countries)
            {
                System.out.println(country.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
