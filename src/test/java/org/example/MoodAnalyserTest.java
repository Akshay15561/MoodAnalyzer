package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {


    @Test
    public void testAnalyseMood_ShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "I am in Sad Mood";
        String result = moodAnalyser.analyseMood(message);
        assertEquals("SAD", result);
    }
}
