package org.example;

public class MoodAnalyser {
    public String analyseMood(String message) {
        String lowerMessage = message.toLowerCase();

        if (lowerMessage.contains("happy") || lowerMessage.contains("joy") || lowerMessage.contains("excited")) {
            return "HAPPY";
        } else if (lowerMessage.contains("sad") || lowerMessage.contains("unhappy") || lowerMessage.contains("down")) {
            return "SAD";
        }
        return null;
    }
}
