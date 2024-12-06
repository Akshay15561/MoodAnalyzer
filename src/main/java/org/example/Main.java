package org.example;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a message:");
            String userMessage = scanner.nextLine();
            moodAnalyser = new MoodAnalyser(userMessage);


            String mood = moodAnalyser.analyseMood();
            System.out.println("The mood is: " + mood);
        } catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Thank you for using the Mood Analyser!");
            }




    }

}
