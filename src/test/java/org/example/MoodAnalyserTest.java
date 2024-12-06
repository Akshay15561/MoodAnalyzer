package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MoodAnalyserTest {


    @Test
    public void testAnalyseMood_ShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD", result);
    }

    @Test
    public void testAnalyseMood_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }
    @Test
    public void testAnalyseMood_ShouldThrowExceptionForNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        Exception exception = assertThrows(IllegalArgumentException.class, moodAnalyser::analyseMood);
        assertEquals("Message cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testAnalyseMood_ShouldThrowExceptionForEmptyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        Exception exception = assertThrows(IllegalArgumentException.class, moodAnalyser::analyseMood);
        assertEquals("Message cannot be null or empty", exception.getMessage());
    }
}
