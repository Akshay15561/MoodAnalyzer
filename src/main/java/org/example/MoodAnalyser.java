package org.example;

public class MoodAnalyser {
    public String analyseMood(String message) {
        String lowerMessage = message.toLowerCase();

        if (lowerMessage.contains("happy") || lowerMessage.contains("joy") || lowerMessage.contains("excited")) {
            return "Happy Mood";
        } else if (lowerMessage.contains("sad") || lowerMessage.contains("unhappy") || lowerMessage.contains("down")) {
            return "Sad Mood";
        }
        return null;
    }
}
