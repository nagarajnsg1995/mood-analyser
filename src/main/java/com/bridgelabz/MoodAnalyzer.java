package com.bridgelabz;

public class MoodAnalyzer {

        public static String analyseMood(String message) {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else if (message.toLowerCase().contains("happy")) {
                return "Happy";
            }
            return null;
        }

        public static void main(String[] args) {
            String mood = MoodAnalyzer.analyseMood("User is Happy");
            System.out.println(mood);
            mood = MoodAnalyzer.analyseMood("User is sad");
            System.out.println(mood);
        }
    }

