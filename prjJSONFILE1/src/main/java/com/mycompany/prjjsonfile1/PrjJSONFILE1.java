/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjjsonfile1;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;
/**
 *
 * @author DrxpS
 */
public class PrjJSONFILE1 {

    public static void main(String[] args) {
        JSONObject personDetails = new JSONObject();
        
        personDetails.put("name" , "Justin");
        personDetails.put("age" , "18");
        personDetails.put("city" , "PE");
        personDetails.put("isStudent" , true);
        
        System.out.println("JSON Object created :\n" + personDetails.toString(4));
        
        String fileName = "person.json";
        
        try (FileWriter file = new FileWriter(fileName)){
            file.write(personDetails.toString(4));
            file.flush();
            System.out.println("\n Successfully wrote JSON object to " + fileName);
        } catch (IOException e){
            System.err.println("An error occurred while writing the file " + e.getMessage());
        }
    }
}
