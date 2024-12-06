package org.example;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
        this.message = "";
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new NullPointerException("Mood is null");
            }

            if (message.trim().isEmpty()) {
                throw new IllegalArgumentException("Mood is empty");
            }
        String lowerMessage = message.toLowerCase();

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        } catch (NullPointerException  e) {
            throw new MoodAnalysisException("Mood is null", ErrorType.NULL_MOOD);
        } catch (IllegalArgumentException e) {
            throw new MoodAnalysisException("Mood is empty", ErrorType.EMPTY_MOOD);
        }

        return "HAPPY";
    }

}
