package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MoodAnalyserTest {


    @Test
    public void testAnalyseMood_ShouldReturnSAD() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD", result);
    }

    @Test
    public void testAnalyseMood_ShouldReturnHAPPY() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }
    @Test
    public void testAnalyseMood_ShouldHandleNullMoodException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
        assertEquals("Mood is null", exception.getMessage());
        assertEquals(ErrorType.NULL_MOOD, exception.getErrorType());
    }

    @Test
    public void testAnalyseMood_ShouldThrowEmptyMoodException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
        assertEquals("Mood is empty", exception.getMessage());
        assertEquals(ErrorType.EMPTY_MOOD, exception.getErrorType());
    }
}
