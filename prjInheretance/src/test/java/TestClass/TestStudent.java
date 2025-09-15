/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.prjinheretance.ArtStudents;
import com.mycompany.prjinheretance.MusicStudent;
import com.mycompany.prjinheretance.SportsStudents;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DrxpS
 */
public class TestStudent {
    
    @Test
    public void testSport()
    {
        SportsStudents s = new SportsStudents("Justin");
        
        String Expected = "Justin";
        String Actual = s.getStrName();
        
        assertEquals(Expected , Actual ,"The name should be Justin");
    }
    @Test
    public void testMusic()
    {
        MusicStudent s = new MusicStudent("Justin");
        
        String Expected = "Justin";
        String Actual = s.getStrName();
        
        assertEquals(Expected , Actual ,"The name should be Justin");
    }
    @Test
    public void testArt()
    {
        ArtStudents s = new ArtStudents("Justin");
        
        String Expected = "Justin";
        String Actual = s.getStrName();
        
        assertEquals(Expected , Actual ,"The name should be Justin");
    }
}
