/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.prjobjectarraylist.Pet;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class TestPet {
    
    @Test
    public void testAddPet()
    {
        ArrayList<Pet> pets = new ArrayList<>();
        
         Pet pet1 = new Pet("Smokey" , 2);
        pets.add(pet1);
        
        assertTrue(pets.contains(pet1) , "ArrayList should contain pet named Smokey");
    }
    
    @Test
    public void testGetPet()
    {
        ArrayList<Pet> pets = new ArrayList<>();
        
        Pet pet1 = new Pet("Cooper" , 9);
        pets.add(pet1);
        Pet firstPet = pets.get(0);
        
        assertEquals("Cooper" ,firstPet.getName() , "Pet in first position should be Cooper");
        
    }
    
    @Test
    public void testDisplayPet()
    {
        ArrayList<Pet> pets = new ArrayList<>();
        
        Pet pet1 = new Pet("Cooper" , 9);
        pets.add(pet1);
        
        
        assertEquals("Cooper is 9 years old" , pet1.displayPet() , "Sentence should display");
        
    }
    
    
    
}
