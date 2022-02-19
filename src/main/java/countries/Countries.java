package countries;

import java.io.InputStream;
import java.io.InputStreamReader;

import java.lang.reflect.Type;

import java.time.ZoneId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import util.ZoneIdAdapter;

public class Countries {

    private List<Country> countries;

    public Countries() {
        this(Countries.class.getResourceAsStream("countries.json"));
    }

    private Countries(InputStream is) {
        Gson gson = new GsonBuilder().registerTypeAdapter(ZoneId.class, new ZoneIdAdapter()).create();
//        Country[] arrayOfCountries = gson.fromJson(new InputStreamReader(is), Country[].class);
//        countries = java.util.Arrays.asList(arrayOfCountries);
        Type type = new TypeToken<List<Country>>(){}.getType();
        countries = gson.fromJson(new InputStreamReader(is), type);
    }

    public List<Country> getAll() {
        return countries;
    }

}
