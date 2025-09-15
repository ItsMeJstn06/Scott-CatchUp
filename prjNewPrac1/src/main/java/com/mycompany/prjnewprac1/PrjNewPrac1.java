/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjnewprac1;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjNewPrac1 {
 
    public static void main(String[] args) {
        Series series = new Series();
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("LATEST SERIES - 2025\n*************************\n"); 
         
        while (true) {
           
            System.out.println("Enter (1) to launch menu or any other key to exit : ");
            String input = scanner.nextLine().trim();
            
            if (!input.equals("1")) break;

            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new series.");
            System.out.println("(2) Search for a series.");
            System.out.println("(3) Update series age restriction.");
            System.out.println("(4) Delete a series.");
            System.out.println("(5) Print series report - 2025.");
            System.out.println("(6) Exit Application.");
            
            System.out.print("Please select one of the following menu items : ");
            
            int intChoice = Integer.parseInt(scanner.nextLine());

            switch (intChoice) {
                case 1: // Capture a new series
                    
                    System.out.println("\nCAPTURE NEW SERIES : \n*****************************\n");
                    System.out.print("Enter the series Id: ");
                    String strId = scanner.nextLine().trim();
                    
                    System.out.print("Enter the series Name: ");
                    String strName = scanner.nextLine().trim();
                    
                    String strAge;
                    
                    do {
                        System.out.print("Enter the series age restriction: ");
                        strAge = scanner.nextLine().trim();
                        
                        if (!series.isValidAge(strAge)) {
                            System.out.println("You have entered an incorrect series age!!!");
                            System.out.println("Please re-enter the series age > ");
                        }
                        
                    } 
                    while (!series.isValidAge(strAge));
                    
                    System.out.print("Enter the number of episodes: ");
                    String strEpisodes = scanner.nextLine().trim();
                    
                    
                    series.CaptureSeries(strId, strName, strAge, strEpisodes);
                    break;

                case 2: // Search for a series
                    System.out.print("Enter the series Id to search: ");
                    String strSearchId = scanner.nextLine().trim();
                    
                   
                    
                    SeriesModel foundSeries = series.SearchSeries(strSearchId);
                    
                    if (foundSeries != null) 
                    {
                        System.out.println("\nSERIES ID: " + foundSeries.SeriesId);
                        System.out.println("SERIES NAME: " + foundSeries.SeriesName);
                        System.out.println("SERIES AGE RESTRICTION: " + foundSeries.SeriesAge);
                        System.out.println("NUMBER OF EPISODES: " + foundSeries.SeriesNumberOfEpisodes);
                    }
                    break;

                case 3: // Update series age restriction
                    System.out.print("Enter the series Id to update: ");
                    String strUpdateId = scanner.nextLine().trim();
                   
                    System.out.print("Enter the series name: ");
                    String strUpdateName = scanner.nextLine().trim();
                    
                    String strUpdateAge;
                    
                    do 
                    {
                        System.out.print("Enter the age restriction: ");
                        strUpdateAge = scanner.nextLine().trim();
                        
                        if (!series.isValidAge(strUpdateAge)) 
                        {
                            System.out.println("You have entered an incorrect series age!!!");
                            System.out.println("Please re-enter the series age > ");
                        }
                        
                    } 
                    while (!series.isValidAge(strUpdateAge));
                    
                    System.out.print("Enter the number of episodes: ");
                    String strUpdateEpisodes = scanner.nextLine().trim();
                   
                    if (series.UpdateSeries(strUpdateId, strUpdateName, strUpdateAge, strUpdateEpisodes)) 
                    {
                        System.out.println("\nSeries updated successfully!!!");
                    }
                    break;

                case 4: // Delete a series
                    System.out.print("Enter the series Id to delete: ");
                    String strDeleteId = scanner.nextLine().trim();
                   
                    System.out.print("Are you sure you want to delete series " + strDeleteId + " from the system? (y) to delete: ");
                    String strConfirm = scanner.nextLine().trim();
                   
                    if (strConfirm.equalsIgnoreCase("y")) 
                    {
                        if (series.DeleteSeries(strDeleteId)) 
                        {
                            System.out.println("Series with Series Id: " + strDeleteId + " was deleted!");
                        }
                    }
                    break;

                case 5: // Print series report
                    series.SeriesReport();
                    break;

                case 6: // Exit
                    series.ExitSeriesApplication();
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}
