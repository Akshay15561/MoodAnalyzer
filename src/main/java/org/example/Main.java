package org.example;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {



        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a message:");
            String userMessage = scanner.nextLine();
            MoodAnalyser moodAnalyser = new MoodAnalyser(userMessage);


            String mood = moodAnalyser.analyseMood();
            System.out.println("The mood is: " + mood);
        } catch(MoodAnalysisException e){
            System.out.println("Error: " + e.getMessage() + " (ErrorType: " + e.getErrorType() + ")");
        } finally {
            scanner.close();
            System.out.println("Thank you for using the Mood Analyser!");

            }




    }

}
