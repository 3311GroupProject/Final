package ParserPackage;

import MiscPackage.Country;
import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonParse {
    public static Country[] parse(String file) throws Exception {
        String json = readFileAsString(file);
       Country[] countryArray = new Gson().fromJson(json, Country[].class);

       return countryArray;
    }
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

}
