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
        String lowerMessage = message.toLowerCase();

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }


}
