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
    public void testAnalyseMood_ShouldHandleNullMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }

    @Test
    public void testAnalyseMood_ShouldHandleEmptyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }
}
