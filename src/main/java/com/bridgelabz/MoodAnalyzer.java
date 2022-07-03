package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;

    // Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
        analyseMood();
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }
}
