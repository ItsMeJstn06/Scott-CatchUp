/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjnewprac1;

import java.util.ArrayList;

/**
 *
 * @author DrxpS
 */
public class Series {
    private ArrayList<SeriesModel> seriesList = new ArrayList<>();

    // Method to capture a new series
    public void CaptureSeries(String Id, String Name, String Age, String Episodes) 
    {
        SeriesModel series = new SeriesModel();
        
        series.SeriesId = Id;
        series.SeriesName = Name;
        series.SeriesAge = Age;
        series.SeriesNumberOfEpisodes = Episodes;
        seriesList.add(series);
        System.out.println("Series processed successfully!!!");
    }

    // Method to search for a series
    public SeriesModel SearchSeries(String id) {
        for (SeriesModel series : seriesList) {
            if (series.SeriesId.equals(id)) {
                return series;
            }
        }
        System.out.println("Series with Series Id: " + id + " was not found!");
        return null;
    }

    // Method to update a series
    public boolean UpdateSeries(String id, String name, String age, String episodes) {
        for (SeriesModel series : seriesList) {
            if (series.SeriesId.equals(id)) {
                series.SeriesName = name;
                series.SeriesAge = age;
                series.SeriesNumberOfEpisodes = episodes;
                return true;
            }
        }
        return false;
    }

    // Method to delete a series
    public boolean DeleteSeries(String id) {
        for (SeriesModel series : seriesList) {
            if (series.SeriesId.equals(id)) {
                seriesList.remove(series);
                
                return true;
            }
        }
       
        return false;
    }

    // Method to generate series report
    public void SeriesReport() {
        
         for (int i = 0 ; i < seriesList.size() ; i++) //loop until all names displayed
        {
            System.out.println("Series " + (i + 1));
            System.out.println("-----------------------------");
            
            for (SeriesModel series : seriesList) {
            System.out.println("SERIES ID: " + series.SeriesId);
            System.out.println("SERIES NAME: " + series.SeriesName);
            System.out.println("SERIES AGE RESTRICTION: " + series.SeriesAge);
            System.out.println("NUMBER OF EPISODES: " + series.SeriesNumberOfEpisodes);
        }
            System.out.println("-----------------------------");
        }    
    }

    // Method to exit the application
    public void ExitSeriesApplication() {
        System.exit(0);
    }

    // Validate age restriction (between 2 and 18, only numbers)
    public boolean isValidAge(String age) {
        try 
        {
            int ageInt = Integer.parseInt(age);
            return ageInt >= 2 && ageInt <= 18;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }
}
