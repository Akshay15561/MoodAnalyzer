package org.example;

import java.util.Scanner;

public class MoodAnalyzer
{
    public static void main( String[] args )
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message:");
        String userMessage = scanner.nextLine();


        String mood = moodAnalyser.analyseMood(userMessage);
        System.out.println("The mood is: " + mood);


        scanner.close();
    }

}
