package com.bridgelabz;


    public class MoodAnalyzer {
        public static String message;

        public MoodAnalyzer() {
        }

        // Constructor
        public MoodAnalyzer(String message) throws MoodAnalysisException {
            this.message = message;
            analyseMood();
        }

        //Getter
        public String getMessage() {
            return message;
        }

        //Setter
        public void setMessage(String message) {
            this.message = message;
        }

        public static String analyseMood() throws MoodAnalysisException {
            try {
                if (message.toLowerCase().contains("sad")) {
                    return "Sad";
                } else {
                    return "Happy";
                }
            } catch (NullPointerException e) {
                throw new MoodAnalysisException("Entered Invalid mood");
            }
        }
    }