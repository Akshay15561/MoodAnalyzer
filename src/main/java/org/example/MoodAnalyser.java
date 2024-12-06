package org.example;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
        this.message = "";
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("Message cannot be null or empty");
        }
        String lowerMessage = message.toLowerCase();

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }

}
