package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
    public List<City> getCities(int choose) {
        List<City> cityList = cities;
        if(choose==1){
            Collections.sort(cityList);
        }else {
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return o1.getProvinceName().compareTo(o2.getProvinceName());
                }
            });
        }


        return cityList;
    }

    /**
     *
     * @param city
     * checks the city exists if not than add the new city
     */

    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        else {
            cities.remove(city);
        }
    }

    /**
     * this method counts the total size of the city list
     * @return returns the size of cities list
     */
    public int count(){
        return cities.size();
    }

}
