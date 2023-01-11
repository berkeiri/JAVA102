package Colection;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> country=new HashMap<>();
        country.put("tr","TÜRKİYE");
        country.put("en","İNGİLTERE");
        country.put("gr","ALMANYA");

        System.out.println(country.get("tr"));
        for (String countryKey:country.keySet()) {
            System.out.println(countryKey);
        }
        for (String countryValue:country.values()) {
            System.out.println(countryValue);
        }



    }
}
