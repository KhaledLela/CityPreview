package com.lelasoft.cityPreview;

import com.lelasoft.cityPreview.model.City;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<City> getDatabase(){
        List<City> cities = new ArrayList<>(3);
        cities.add(new City("Cairo",
                "This city is the capital of Egypt",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Cairo-citadel-1800s.jpg/250px-Cairo-citadel-1800s.jpg"));

        cities.add(new City("Cairo",
                "This city is the capital of Egypt",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Cairo-citadel-1800s.jpg/250px-Cairo-citadel-1800s.jpg"));

        cities.add(new City("Cairo",
                "This city is the capital of Egypt",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Cairo-citadel-1800s.jpg/250px-Cairo-citadel-1800s.jpg"));
        return cities;
    }
}
