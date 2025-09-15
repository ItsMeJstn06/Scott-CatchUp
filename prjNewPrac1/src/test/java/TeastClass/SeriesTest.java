/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TeastClass;

import com.mycompany.prjnewprac1.Series;
import com.mycompany.prjnewprac1.SeriesModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class SeriesTest {
    
    private Series series = new Series();
    private SeriesModel sampleSeries = new SeriesModel();

    @Test
    public void TestSearchSeries() {
        // Setup
        sampleSeries.SeriesId = "101";
        sampleSeries.SeriesName = "Extreme Sports";
        sampleSeries.SeriesAge = "12";
        sampleSeries.SeriesNumberOfEpisodes = "10";
        series.CaptureSeries("101", "Extreme Sports", "12", "10");

        // Test
        SeriesModel result = series.SearchSeries("101");
        assertNotNull(result);
        assertEquals("101", result.SeriesId);
        assertEquals("Extreme Sports", result.SeriesName);
        assertEquals("12", result.SeriesAge);
        assertEquals("10", result.SeriesNumberOfEpisodes);
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() {
        // Test
        SeriesModel result = series.SearchSeries("102");
        assertNull(result);
    }

    @Test
    public void TestUpdateSeries() {
        // Setup
        series.CaptureSeries("101", "Extreme Sports", "12", "10");

        // Test
        boolean updated = series.UpdateSeries("101", "Extreme Sports 2025", "14", "12");
        SeriesModel result = series.SearchSeries("101");
        assertTrue(updated);
        assertEquals("Extreme Sports 2025", result.SeriesName);
        assertEquals("14", result.SeriesAge);
        assertEquals("12", result.SeriesNumberOfEpisodes);
    }

    @Test
    public void TestDeleteSeries() {
        // Setup
        series.CaptureSeries("101", "Extreme Sports", "12", "10");

        // Test
        boolean deleted = series.DeleteSeries("101");
        SeriesModel result = series.SearchSeries("101");
        assertTrue(deleted);
        assertNull(result);
    }

    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        // Test
        boolean deleted = series.DeleteSeries("102");
        assertFalse(deleted);
    }

    @Test
    public void TestSeriesAgeRestriction_AgeValid() {
        // Test
        boolean isValid = series.isValidAge("12");
        assertTrue(isValid);
    }

    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInvalid() {
        // Test
        boolean isValid = series.isValidAge("19"); // Outside 2-18 range
        assertFalse(isValid);

        boolean isInvalidNonNumber = series.isValidAge("abc"); // Non-number
        assertFalse(isInvalidNonNumber);
    }
    
    
}
